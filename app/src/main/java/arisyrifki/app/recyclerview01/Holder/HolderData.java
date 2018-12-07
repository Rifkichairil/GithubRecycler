package arisyrifki.app.recyclerview01.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import arisyrifki.app.recyclerview01.R;

/**
 * Created by rfkchrl on 12/7/2018.
 */

public class HolderData extends RecyclerView.ViewHolder{
    public TextView txtName, txtSubname;

    public HolderData(View itemView) {
        super(itemView);

        txtName = (TextView) itemView.findViewById(R.id.name);
        txtSubname = (TextView) itemView.findViewById(R.id.subname);
    }
}
