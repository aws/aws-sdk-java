/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

/**
 * Structure for the ack response of PutMedia API call.
 * Can be shared by the service and clients which wants to
 * deserialize the ack response into a structure.
 */
// TODO documentation
public class AckEvent implements Serializable {

    private AckEventType ackEventType;
    private Long fragmentTimecode;
    private String fragmentNumber;
    private AckErrorCode errorCode;
    private Integer errorId;

    public AckEventType getAckEventType() {
        return ackEventType;
    }

    public void setAckEventType(AckEventType ackEventType) {
        this.ackEventType = ackEventType;
    }

    public AckEvent withAckEventType(AckEventType ackEventType) {
        setAckEventType(ackEventType);
        return this;
    }

    public AckEvent withAckEventType(String ackEventType) {
        setAckEventType(AckEventType.of(ackEventType));
        return this;
    }

    public AckEvent withAckEventType(AckEventType.Values ackEventType) {
        setAckEventType(AckEventType.of(ackEventType));
        return this;
    }

    public Long getFragmentTimecode() {
        return fragmentTimecode;
    }

    public void setFragmentTimecode(Long fragmentTimecode) {
        this.fragmentTimecode = fragmentTimecode;
    }

    public AckEvent withFragmentTimecode(Long fragmentTimecode) {
        setFragmentTimecode(fragmentTimecode);
        return this;
    }

    public String getFragmentNumber() {
        return fragmentNumber;
    }

    public void setFragmentNumber(String fragmentNumber) {
        this.fragmentNumber = fragmentNumber;
    }

    public AckEvent withFragmentNumber(String fragmentNumber) {
        setFragmentNumber(fragmentNumber);
        return this;
    }

    public AckErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(AckErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public AckEvent withErrorCode(String errorCode) {
        setErrorCode(AckErrorCode.of(errorCode));
        return this;
    }

    public AckEvent withErrorCode(AckErrorCode.Values errorCode) {
        setErrorCode(AckErrorCode.of(errorCode));
        return this;
    }

    public Integer getErrorId() {
        return errorId;
    }

    public void setErrorId(Integer errorId) {
        this.errorId = errorId;
    }

    public AckEvent withErrorId(Integer errorId) {
        setErrorId(errorId);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AckEvent ackEvent = (AckEvent) o;

        if (ackEventType != ackEvent.ackEventType) {
            return false;
        }
        if (fragmentTimecode != null ? !fragmentTimecode.equals(ackEvent.fragmentTimecode) : ackEvent.fragmentTimecode != null) {
            return false;
        }
        if (fragmentNumber != null ? !fragmentNumber.equals(ackEvent.fragmentNumber) : ackEvent.fragmentNumber != null) {
            return false;
        }
        if (errorCode != null ? !errorCode.equals(ackEvent.errorCode) : ackEvent.errorCode != null) {
            return false;
        }
        return errorId == ackEvent.errorId;
    }

    @Override
    public int hashCode() {
        int result = ackEventType != null ? ackEventType.hashCode() : 0;
        result = 31 * result + (fragmentTimecode != null ? fragmentTimecode.hashCode() : 0);
        result = 31 * result + (fragmentNumber != null ? fragmentNumber.hashCode() : 0);
        result = 31 * result + (errorCode != null ? errorCode.hashCode() : 0);
        result = 31 * result + (errorId != null ? errorId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AckEvent{" +
               "ackEventType=" + ackEventType +
               ", fragmentTimecode=" + fragmentTimecode +
               ", fragmentNumber='" + fragmentNumber + '\'' +
               ", errorCode=" + errorCode +
               ", errorId=" + errorId +
               '}';
    }
}
