package arisyrifki.app.recyclerview01;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import arisyrifki.app.recyclerview01.Adapter.AdapterData;
import arisyrifki.app.recyclerview01.Model.ModelData;

/**
 * Created by rfkchrl on 12/7/2018.
 */

// langkah paling awal setelah buat project
    // file -> Project Structure -> app -> Dependeces
    //terkadang appcompactnya diganti menjadi V7.26
    //untuk menambahkan klik icon +, dan mengurangi klik yg akan dikurangi lalu klik icon -
    //jangan lupa MainActivitynya didaftarkan ke manifest
public class MainActivity extends AppCompatActivity {

    public List<ModelData> data = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casting recyclerview
        recyclerView = (RecyclerView) findViewById(R.id.recview);

        //this itu Mainactivity
        LinearLayoutManager linear = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linear);

        dataCollections();

        AdapterData adapter = new AdapterData(data);
        recyclerView.setAdapter(adapter);
    }

    //data ini yg akan dikeluarkan oleh getItemCount
    private void dataCollections() {
        data.add(new ModelData("Paket Hemat 1", "15.000"));
        data.add(new ModelData("Paket Hemat 2", "16.000"));
        data.add(new ModelData("Paket Hemat 3", "17.000"));
        data.add(new ModelData("Paket Hemat 4", "18.000"));
        data.add(new ModelData("Paket Hemat 5", "19.000"));
    }
}
