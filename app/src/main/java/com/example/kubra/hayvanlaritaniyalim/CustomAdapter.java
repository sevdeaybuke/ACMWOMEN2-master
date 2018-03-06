package com.example.kubra.hayvanlaritaniyalim;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    ArrayList<HayvanModel> hayvanList;

public CustomAdapter(Activity activity,ArrayList<HayvanModel> hayvanList){
    this.hayvanList=hayvanList;
    layoutInflater= (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
}
    @Override
    public int getCount() {
        return hayvanList.size();
    }

    @Override
    public Object getItem(int position) {
        return hayvanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satir=layoutInflater.inflate(R.layout.custom_satir,parent,false);

        HayvanModel hayvanModel=hayvanList.get(position);

        ImageView hayvanFoto= (ImageView) satir.findViewById(R.id.imageViewHayvanFoto);
        TextView hayvanIsmi= (TextView) satir.findViewById(R.id.textViewIsim);
        final ImageView playPause= (ImageView) satir.findViewById(R.id.imageViewPlayPause);
        ImageView replay= (ImageView) satir.findViewById(R.id.imageViewReplay);

        hayvanFoto.setImageResource(hayvanModel.getHayvanFotoId());
        hayvanIsmi.setText(hayvanModel.getHayvanIsmi());
        playPause.setImageResource(R.drawable.play);
        playPause.setTag(R.drawable.play);
        replay.setImageResource(R.drawable.replay);

        final MediaPlayer mediaPlayer=MediaPlayer.create(satir.getContext(),hayvanModel.getSesDosyasıId());
       mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                playPause.setImageResource(R.drawable.play);
                playPause.setTag(R.drawable.play);}});
        playPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Integer)playPause.getTag()==R.drawable.play){
                    playPause.setImageResource(R.drawable.stop);
                    playPause.setTag(R.drawable.stop);
                    mediaPlayer.start();
                }
              else if((Integer)playPause.getTag()==R.drawable.stop){
                    playPause.setImageResource(R.drawable.play);
                   playPause.setTag(R.drawable.play);
                    mediaPlayer.pause();
                }}});
replay.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        mediaPlayer.pause();
        mediaPlayer.seekTo(0);
        mediaPlayer.start();
        playPause.setImageResource(R.drawable.stop);
        playPause.setTag(R.drawable.stop);
    }
});return satir;
    }
}
