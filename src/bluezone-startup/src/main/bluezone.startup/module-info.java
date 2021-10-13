module bluezone.startup {

	/*
	 * Depends on all the other modules: hexagon and adapters
	 */
	requires bluezone.hexagon;
	requires bluezone.adapter.forparkingcars.test;
	requires bluezone.adapter.forcheckingcars.test;
	requires bluezone.adapter.forobtainingrates.stub;
	requires bluezone.adapter.forstoringpermits.fake;
	requires bluezone.adapter.forpaying.mock;
	
//	provides	io.github.jmgarridopaz.bluezone.adapter.forparkingcars.test.DrivenSide
//	with		io.github.jmgarridopaz.bluezone.startup.forparkingcars.test.DependencyConfigurator;
//
//	provides	io.github.jmgarridopaz.bluezone.adapter.forparkingcars.test.DriverPortBuilder
//	with		io.github.jmgarridopaz.bluezone.startup.forparkingcars.test.DependencyConfigurator;
//
}
