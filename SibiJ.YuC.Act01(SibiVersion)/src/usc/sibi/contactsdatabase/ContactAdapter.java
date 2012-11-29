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
		public ContactAdapter(Context context, MemeClass[] values){
			super(context, R.layout.activity_main,values);
			this.context = context;
			this.values = values;	
		}
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View rowView = inflater.inflate(R.layout.activity_main, parent, false);
			TextView tvName = (TextView) rowView.findViewById(R.id.tvNameLabel);
			TextView tvDesc = (TextView) rowView.findViewById(R.id.tvDescLabel);
			ImageView img = (ImageView) rowView.findViewById(R.id.image);			
			tvName.setText(values[position].getMemeName());
			tvDesc.setText(values[position].getMemeUrl());
			img.setImageResource(values[position].getMemeImage());
			return rowView;
			//super.getView(position, convertView, parent);
		}
		
		
}
