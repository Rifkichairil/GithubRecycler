package arisyrifki.app.recyclerview01.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import arisyrifki.app.recyclerview01.Holder.HolderData;
import arisyrifki.app.recyclerview01.Model.ModelData;
import arisyrifki.app.recyclerview01.R;

/**
 * Created by rfkchrl on 12/7/2018.
 */

public class AdapterData extends RecyclerView.Adapter<HolderData> {

    //membuat list untuk datanya.
    private List<ModelData> data;

    //construktor
    public AdapterData(List<ModelData> data) {
        this.data = data;
    }

    @Override
    public HolderData onCreateViewHolder(ViewGroup parent, int viewType) {
        //mengembalikan Holder ... dan mencari item_data
        return new HolderData(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data,parent,false));
    }

    @Override
    public void onBindViewHolder(HolderData holder, int position) {
        //set TextView yang di holder menjadi public agar dapat diakses disini. (Holder)
        //set method menjadi string jika tulisan. (Model)
        //txtName dari Model dan Holder, penulisan disamakan agar mempermudah
        //sedangkan data dari list dan GetTxt... dari Model
        holder.txtName.setText(data.get(position).getTxtName());
        holder.txtSubname.setText(data.get(position).getTxtSubname());

    }

    @Override
    public int getItemCount() {
        // mengembalikan berapa banyak data yang akan di input.
        return data.size();
    }
}
