package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class MapOptions extends JavaScriptObject {
	
	protected MapOptions() {}
	
	public static native MapOptions create() 
	/*-{
		return {};
	}-*/;

	public native final void setCenter(LatLng c) 
	/*-{
		this.center = c;
	}-*/;

	public native final void setCrs(Crs crs) 
	/*-{
	 	this.crs = crs;
	}-*/;

	public native final void setAttributionControl(boolean b) 
	/*-{
		this.attributionControl = b;
	}-*/;

	public native final void setZoom(int zoom) 
	/*-{
		this.zoom = zoom;
	}-*/;

}
