package com.example.mygames2;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GameAdapter extends BaseAdapter implements View.OnClickListener {
    private Game mGame;
    private Context mContext;

    private ImageView gameImg;
    private TextView gameTitle;
    private TextView gameDesc;
    private Button startBtn;

    private ArrayList<Game> mGameData;

    public GameAdapter(Context context) {
        super();
        mContext = context;
        mGameData = new ArrayList<Game>();
    }

    @Override
    public int getCount() {
        return mGameData.size();
    }

    @Override
    public Game getItem(int position) {
        return mGameData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, final View convertView, final ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            v = ((LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.listitemlayout, null);
        }
        gameImg = (ImageView)v.findViewById(R.id.img);
        gameTitle = (TextView)v.findViewById(R.id.title);
        gameDesc = (TextView)v.findViewById(R.id.desc);
        startBtn = (Button)v.findViewById(R.id.btn);

        mGame = getItem(position);
        startBtn.setTag(mGame);

        if(mGame != null) {
            if(mGame.getGameImg() != null) {
                gameImg.setImageDrawable(mGame.getGameImg());
            }
            gameTitle.setText(mGame.getGameName());
            gameDesc.setText(mGame.getGameDesc());
            startBtn.setOnClickListener(this);
        }
        return v;
    }

    public void add(Game game) {
        mGameData.add(game);
    }

    @Override
    public void onClick(View v) {
        Game clickItem = (Game)v.getTag();
//        String sText = ((TextView) v).getText().toString();
//        switch (v.getId()) {
//            case R.id.btn:
//                if (sText.equals("자유 곡선")) {
//                    Intent intent = new Intent(v.getContext(), FreeLine.class);
//                    v.getContext().startActivity(intent);
//                } else {
//                    Intent intent2 = new Intent(v.getContext(), MoveCircle.class);
//                    v.getContext().startActivity(intent2);
//                }
//                Toast.makeText(mContext, clickItem.getmToast(), Toast.LENGTH_SHORT).show();
//                break;

//        switch (v.getId()) {
//            case R.id.btn:
//                Toast.makeText(mContext, clickItem.getmToast(), Toast.LENGTH_SHORT).show();
//                break;
//        }
    }
}
