This is the master branch.

package com.androidquery;

import android.app.Activity;
import android.content.Context;
import android.view.View;

import com.androidquery.util.MemoryTrimmableRegistry;

/**
 * The main class of AQuery. All methods are actually inherited from AbstractAQuery.
 *
 */
public class AQuery extends AbstractAQuery<AQuery>{

	
	public AQuery(Activity act) {
        super(act);
        MemoryTrimmableRegistry.createMemoryTrimmableRegistry(act);
	}
	
	public AQuery(View view) {
		super(view);
        MemoryTrimmableRegistry.createMemoryTrimmableRegistry(view.getContext());
	}
	
	public AQuery(Context context) {
		super(context);
        MemoryTrimmableRegistry.createMemoryTrimmableRegistry(context);
	}
	
	public AQuery(Activity act, View root){
		super(act, root);
        if(act != null)
            MemoryTrimmableRegistry.createMemoryTrimmableRegistry(act);
        else
			if(root != null)
            MemoryTrimmableRegistry.createMemoryTrimmableRegistry(root.getContext());
			
	}
}
Fuck off.



