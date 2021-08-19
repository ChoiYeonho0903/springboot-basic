package org.prgrms.kdt.voucher;

import java.util.UUID;

public class PercentDiscountVoucher implements Voucher{
    private final UUID voucherId;

    public long getPercent() {
        return percent;
    }

    private final long percent;




    public PercentDiscountVoucher(UUID voucherId, long percent) {
        this.voucherId = voucherId;
        this.percent = percent;
    }

    @Override
    public UUID getVoucherId() {
        return voucherId;
    }

    @Override
    public long discount(long beforeDiscount) {
        return beforeDiscount-(percent/100);
    }

    @Override
    public String toString() {
        return "PercentDiscountVoucher{" +
                "voucherId=" + voucherId +
                ", percent=" + percent +
                '}';
    }
}
