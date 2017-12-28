package br.com.giltecnologia.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        List<Livro> livros = Arrays.asList(new Livro("Senhor dos anéis", "100"),
                new Livro("O código da vinci", "230"),
                new Livro("A muralha", "10"),
                new Livro("O código da vinci", "230"),
                new Livro("O código da vinci", "230"),
                new Livro("O código da vinci", "230"),
                new Livro("O código da vinci", "230"),
                new Livro("O código da vinci", "230"),
                new Livro("O código da vinci", "230"),
                new Livro("O código da vinci", "230"),
                new Livro("O código da vinci", "230"), new Livro("O código da vinci", "230")
        );

        mRecyclerView.setAdapter(new RecycleAdapter(livros, this));
        RecyclerView.LayoutManager layout = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layout);

    }
}
