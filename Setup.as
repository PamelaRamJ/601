package  {
	
	import flash.display.MovieClip;
	import flash.events.Event;
	
	public class Setup extends MovieClip {
		
		private var FONDO_new: FONDO=new FONDO();
		private var PISO_new: PISO=new PISO();
		static  var PROTAGONISTA_new: PROTAGONISTA=new PROTAGONISTA();
		private var ANTAGONISTA_new: ANTAGONISTA=new ANTAGONISTA();
		static var PUNTOS: Number =0;
		static var PUNTOS_BOX_new: PUNTOS_BOX = new PUNTOS_BOX();
		
		
		public function Setup(){
			// constructor code
			addChild(FONDO_new);
			addChild(PISO_new);
			addChild(PROTAGONISTA_new);
			addChild(ANTAGONISTA_new);
			addChild(PUNTOS_BOX_new);
			
			PUNTOS_BOX_new.x= 50;
			PUNTOS_BOX_new.y= 50;
			PUNTOS_BOX_new.PUNTOSTXT.text= String(PUNTOS); 
			 
			FONDO_new.y =200;
			FONDO_new.x =275;
			
			PISO_new.y =385;
			PISO_new.x =275;
			
			PROTAGONISTA_new.y =350;
			PROTAGONISTA_new.x =275;
			
			ANTAGONISTA_new.y =50;
			ANTAGONISTA_new.x =275;
			
			this.addEventListener(Event.ENTER_FRAME, actualiza_PUNTOS);			
			
		}
		public function actualiza_PUNTOS(e: Event){
			 PUNTOS_BOX_new.PUNTOSTXT.text =String(PUNTOS);
		}

	}
	
}

