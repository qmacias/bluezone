//package io.github.jmgarridopaz.bluezone.startup.forparkingcars.test;
//
//import java.util.Set;
//
//import io.github.jmgarridopaz.bluezone.adapter.forobtainingrates.stub.ForObtainingRatesStubAdapter;
//import io.github.jmgarridopaz.bluezone.adapter.forparkingcars.test.DrivenSide;
//import io.github.jmgarridopaz.bluezone.adapter.forparkingcars.test.DriverPortBuilder;
//import io.github.jmgarridopaz.bluezone.adapter.forpaying.mock.ForPayingMockAdapter;
//import io.github.jmgarridopaz.bluezone.adapter.forstoringpermits.fake.ForStoringPermitsFakeAdapter;
//import io.github.jmgarridopaz.bluezone.hexagon.ForObtainingRates;
//import io.github.jmgarridopaz.bluezone.hexagon.ForParkingCars;
//import io.github.jmgarridopaz.bluezone.hexagon.ForPaying;
//import io.github.jmgarridopaz.bluezone.hexagon.ForStoringPermits;
//import io.github.jmgarridopaz.bluezone.hexagon.PermitTicket;
//import io.github.jmgarridopaz.bluezone.hexagon.RateData;
//import io.github.jmgarridopaz.bluezone.startup.HardCodedHexagon;
//import io.github.jmgarridopaz.bluezone.startup.Hexagon;
//import io.github.jmgarridopaz.bluezone.startup.RealHexagon;
//
//
//public class DependencyConfigurator implements DrivenSide, DriverPortBuilder {
//
//	private final boolean hardcodedHexagon;
//
//	private DependencyConfigurator ( boolean hardcodedHexagon ) {
//		this.hardcodedHexagon = hardcodedHexagon;
//	}
//
//	
//	public static DependencyConfigurator provider() {
//		return new DependencyConfigurator ( Startup.isHardcodedHexagon() );
//	}
//	
//
//	@Override
//	public ForParkingCars forParkingCars(ForObtainingRates forObtainingRates, ForStoringPermits forStoringPermits, ForPaying forPaying) {
//		Hexagon hexagon;
//		if ( this.hardcodedHexagon ) {
//			hexagon = new HardCodedHexagon();
//		} else {
//			hexagon = new RealHexagon(forObtainingRates,forStoringPermits,forPaying);			
//		}
//		return hexagon.forParkingCars();
//	}
//
//	@Override
//	public ForObtainingRates initRateRepositoryWith(Set<RateData> rates) {
//		return new ForObtainingRatesStubAdapter(rates);
//	}
//
//	@Override
//	public ForStoringPermits initPermitRepositoryWith(Set<PermitTicket> permits) {
//		return new ForStoringPermitsFakeAdapter(permits);
//	}
//
//	@Override
//	public ForPaying initPaymentRecipient() {
//		return new ForPayingMockAdapter();
//	}
//
//}
