package usc.sibi.contactsdatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactAdapter extends ArrayAdapter<Contact>{
	
	private final Context context;
	private final Contact[] values;
	private final char type;
		public ContactAdapter(Context context, Contact[] values, char type){
			super(context, R.layout.item_list,values);
			this.context = context;
			this.values = values;
			this.type = type;
		}
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View rowView = inflater.inflate(R.layout.item_list, parent, false);
			
			return rowView;
			//super.getView(position, convertView, parent);
		}
		
		
}
