package sixminuteinterview;

public class PhoneNumber {

    public static final int SWITZERLAND = 0;
    public static final String[] NATIONAL_DESTINATION_CODES = {
            "071", "043", "044", "031", "033", "034", "041", "052", "055", "061", "062", "081", "091", "021", "022", "026" // Swiss regional codes
    };

    private static final String[] REASONS = {
            "Phone Number Too Long or Too Short",
            "Swiss Number must be valid for its region and length",
            "Unknown Regional Code"
    };

    /**
     * The original value.
     */
    private String originalValue = null;

    // An index into the COUNTRY_CODES array
    private int countryCodeIndex = SWITZERLAND;
    private String strippedValue = null;
    private String invalidReason = null;

    public PhoneNumber(String originalValue) {
        this.originalValue = originalValue;
        this.strippedValue = stripPhoneNumber(originalValue);
        this.countryCodeIndex = getNationalDestinationCodeIndex(this.strippedValue);
        this.invalidReason = validate(this.countryCodeIndex, this.strippedValue);
    }

    /**************************************************************************/
    /* Reduce the string to just numbers */
    private static String stripPhoneNumber(String number) {
        return number.replaceAll("\\D", "");
    }

    /**************************************************************************/
    private static int getNationalDestinationCodeIndex(String strippedNumber) {
        for (int i = 0; i < NATIONAL_DESTINATION_CODES.length; i++) {
            if (strippedNumber.startsWith(NATIONAL_DESTINATION_CODES[i])) {
                return i;
            }
        }
        return -1; // Unknown regional code
    }

    /**************************************************************************/
    private static String validate(int countryCodeIndex, String strippedNumber) {
        if (countryCodeIndex == -1) {
            return REASONS[2];
        }
        return validateSwissNumber(strippedNumber);
    }

    /**************************************************************************/
    /*
     *  Swiss Phone number must be valid for regional codes and length (9-10 digits)
     */
    private static String validateSwissNumber(String strippedNumber) {
        int length = strippedNumber.length();
        return (length >= 9 && length <= 10) ? null : REASONS[1];
    }

    /**************************************************************************/
    public String getValueAsInternational() {
        return "+41" + strippedValue.substring(NATIONAL_DESTINATION_CODES[countryCodeIndex].length());
    }

    /**************************************************************************/
    public boolean isValid() {
        return (this.invalidReason == null);
    }

    /**************************************************************************/
    public String getInvalidReason() {
        return this.invalidReason;
    }

    /**************************************************************************/
    public String getOriginalText() {
        return originalValue;
    }

    /**************************************************************************/
    public String getStrippedNumber() {
        return this.strippedValue;
    }

    /**************************************************************************/
    /**************************************************************************/
}
