package Model;

public class Gear {

	private String GearManufacture;
	private int   GearMode;
	private String Geartype;
	
	public Gear() {}
	
	public Gear(String gearManufacture, int gearMode, String geartype) {
		GearManufacture = gearManufacture;
		GearMode = gearMode;
		Geartype = geartype;
	}

	public String getGearManufacture() {
		return GearManufacture;
	}

	public void setGearManufacture(String gearManufacture) {
		GearManufacture = gearManufacture;
	}

	public int getGearMode() {
		return GearMode;
	}

	public void setGearMode(int gearMode) {
		GearMode = gearMode;
	}

	public String getGeartype() {
		return Geartype;
	}

	public void setGeartype(String geartype) {
		Geartype = geartype;
	}

	@Override
	public String toString() {
		return "Gear [GearManufacture=" + GearManufacture + ", GearMode=" + GearMode + ", Geartype=" + Geartype + "]";
	}
}
