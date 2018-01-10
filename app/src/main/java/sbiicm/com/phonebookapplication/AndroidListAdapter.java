package sbiicm.com.phonebookapplication;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by praneeth on 1/4/2018.
 */

public class AndroidListAdapter extends ArrayAdapter {

    private Context mContext;
    private List<Users> usersList = new ArrayList<>();

    public AndroidListAdapter(@NonNull Context context, ArrayList<Users> list)
    {
        super(context,0,list);
        mContext =context;
        usersList =list;

    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.itemrow,parent,false);

        Users currentUser = usersList.get(position);

        ImageView call = (ImageView)listItem.findViewById(R.id.imageView);
        call.setImageResource(R.mipmap.call);

        ImageView msg = (ImageView) listItem.findViewById(R.id.imageView2);
        msg.setImageResource(R.mipmap.message);

        TextView release = (TextView) listItem.findViewById(R.id.textView);
        release.setText(currentUser.getName());

        return listItem;
    }


}
