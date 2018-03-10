package aashna.com.aashna.aashna_main;

import android.view.View;

/**
 * A click listener for items.
 */

public interface ItemClickListener {

   /**
    * Called when an item is clicked.
    *
    * @param view View of the item that was clicked.
    * @param position  Position of the item that was clicked.
    */

   void onClick(View view, int position);

}
