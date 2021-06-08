/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/DescribeJournalKinesisStream" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJournalKinesisStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ledger.
     * </p>
     */
    private String ledgerName;
    /**
     * <p>
     * The UUID (represented in Base62-encoded text) of the QLDB journal stream to describe.
     * </p>
     */
    private String streamId;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param ledgerName
     *        The name of the ledger.
     */

    public void setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @return The name of the ledger.
     */

    public String getLedgerName() {
        return this.ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param ledgerName
     *        The name of the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJournalKinesisStreamRequest withLedgerName(String ledgerName) {
        setLedgerName(ledgerName);
        return this;
    }

    /**
     * <p>
     * The UUID (represented in Base62-encoded text) of the QLDB journal stream to describe.
     * </p>
     * 
     * @param streamId
     *        The UUID (represented in Base62-encoded text) of the QLDB journal stream to describe.
     */

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    /**
     * <p>
     * The UUID (represented in Base62-encoded text) of the QLDB journal stream to describe.
     * </p>
     * 
     * @return The UUID (represented in Base62-encoded text) of the QLDB journal stream to describe.
     */

    public String getStreamId() {
        return this.streamId;
    }

    /**
     * <p>
     * The UUID (represented in Base62-encoded text) of the QLDB journal stream to describe.
     * </p>
     * 
     * @param streamId
     *        The UUID (represented in Base62-encoded text) of the QLDB journal stream to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJournalKinesisStreamRequest withStreamId(String streamId) {
        setStreamId(streamId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLedgerName() != null)
            sb.append("LedgerName: ").append(getLedgerName()).append(",");
        if (getStreamId() != null)
            sb.append("StreamId: ").append(getStreamId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJournalKinesisStreamRequest == false)
            return false;
        DescribeJournalKinesisStreamRequest other = (DescribeJournalKinesisStreamRequest) obj;
        if (other.getLedgerName() == null ^ this.getLedgerName() == null)
            return false;
        if (other.getLedgerName() != null && other.getLedgerName().equals(this.getLedgerName()) == false)
            return false;
        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLedgerName() == null) ? 0 : getLedgerName().hashCode());
        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeJournalKinesisStreamRequest clone() {
        return (DescribeJournalKinesisStreamRequest) super.clone();
    }

}
