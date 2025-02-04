package org.prgms.kdt.application.voucher.domain;

import java.util.Arrays;

public enum VoucherType {
    FIXED_AMOUNT("FIXED"),
    PERCENT_DISCOUNT("PERCENT");

    private final String type;

    VoucherType(String type) {
        this.type = type;
    }

    public static VoucherType findVoucherType (String type) {
        return Arrays.stream(values())
                .filter(i -> i.type.equals(type))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("This voucher type is not supported."));
    }

    public String getType () {
        return type;
    }
}
