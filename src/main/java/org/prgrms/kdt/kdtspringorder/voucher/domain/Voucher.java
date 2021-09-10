package org.prgrms.kdt.kdtspringorder.voucher.domain;

import lombok.Getter;
import org.prgrms.kdt.kdtspringorder.common.enums.VoucherType;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * 바우처 추상클래스
 */
@Getter
public abstract class Voucher implements Discountable, Serializable {

    private final UUID voucherId;

    private UUID customerId;

    protected VoucherType voucherType;

    private final long amount;

    private Boolean useYn;

    private LocalDateTime createdAt;

    private LocalDateTime usedAt;

    public Voucher(UUID voucherId, long amount) {
        this.voucherId = voucherId;
        this.amount = amount;
    }

    public Voucher(UUID voucherId, UUID customerId, long amount) {
        this.voucherId = voucherId;
        this.customerId = customerId;
        this.amount = amount;
    }

    public Voucher(UUID voucherId, UUID customerId, VoucherType voucherType, long amount, boolean useYn, LocalDateTime createdAt, LocalDateTime usedAt) {
        this.voucherId = voucherId;
        this.customerId = customerId;
        this.voucherType = voucherType;
        this.amount = amount;
        this.useYn = useYn;
        this.createdAt = createdAt;
        this.usedAt = usedAt;
    }

}
