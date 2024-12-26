package zeev.fraiman.swiperecyclerview;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

public class SwipeToDeleteCallback extends ItemTouchHelper.SimpleCallback {
    private ItemAdapter adapter;

    public SwipeToDeleteCallback(ItemAdapter adapter) {
        super(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT);
        this.adapter = adapter;
    }

    @Override
    public boolean onMove(@NonNull RecyclerView recyclerView,
                          @NonNull RecyclerView.ViewHolder viewHolder,
                          @NonNull RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
        int position = viewHolder.getAdapterPosition();
        Item item = adapter.items.get(position);

        Context context = viewHolder.itemView.getContext();
        Intent intent = new Intent(context, FullscreenImageActivity.class);
        intent.putExtra("imageResId", item.getImageResId());
        context.startActivity(intent);

        adapter.notifyItemChanged(position);
    }
}
