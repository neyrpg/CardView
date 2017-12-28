package br.com.giltecnologia.cardview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
    private Context context;
    private List<Livro> livros;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txNome;
        public TextView txValor;

        public ViewHolder(View view) {
            super(view);
            txNome = view.findViewById(R.id.tx_nome);
            txValor = view.findViewById(R.id.tx_valor);
        }
    }

    public RecycleAdapter(List<Livro> livros, Context context) {
       this.livros = livros;
       this.context = context;

    }

    @Override
    public RecycleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                        int viewType) {
        // create a new view
        View view = LayoutInflater.from(context )
                .inflate(R.layout.lista_livros, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txNome.setText(livros.get(position).getNome());
        holder.txValor.setText(livros.get(position).getValor()                                                                                                                                                                                  );

    }

    @Override
    public int getItemCount() {
        return livros.size();
    }
}