package app.zsound.Adapter;

import android.app.Activity;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import app.zsound.MainActivity;
import app.zsound.R;
import app.zsound.Som;

/**
 * Created by Jhefyy on 22/02/2017.
 */

public class SomAdapter extends BaseAdapter {
    private final List<Som> sons;
    Activity activity;

    public SomAdapter(List<Som> sons, MainActivity activity) {
        this.activity = activity;
        this.sons = sons;
    }

    @Override
    public int getCount() {
        return sons.size();
    }

    @Override
    public Object getItem(int i) {
        return sons.get(i);
    }

    @Override
    public long getItemId(int i) {
        return sons.get(i).getId();
    }

    @Override
    public View getView(int i, View viewC, ViewGroup viewGroup) {

        View view = activity.getLayoutInflater().inflate(R.layout.lista_sons, viewGroup, false);

        final Som som = sons.get(i);

        TextView tvDescricao = (TextView)view.findViewById(R.id.tvDescricao);
        tvDescricao.setText(som.getDescricao());

        return view;
    }
}
