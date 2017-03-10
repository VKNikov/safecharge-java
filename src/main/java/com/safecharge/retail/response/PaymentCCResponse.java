package com.safecharge.retail.response;

/**
 * Copyright (C) 2007-2017 SafeCharge International Group Limited.
 *
 * @author <a mailto:nikolad@safecharge.com>Nikola Dichev</a>
 * @since 2/15/2017
 */
public class PaymentCCResponse extends BasePaymentsResponse implements PaymentsResponse {

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentCCResponse{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}