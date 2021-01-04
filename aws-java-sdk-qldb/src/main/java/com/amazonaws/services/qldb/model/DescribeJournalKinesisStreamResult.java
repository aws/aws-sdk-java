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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/DescribeJournalKinesisStream" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJournalKinesisStreamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the QLDB journal stream returned by a <code>DescribeJournalS3Export</code> request.
     * </p>
     */
    private JournalKinesisStreamDescription stream;

    /**
     * <p>
     * Information about the QLDB journal stream returned by a <code>DescribeJournalS3Export</code> request.
     * </p>
     * 
     * @param stream
     *        Information about the QLDB journal stream returned by a <code>DescribeJournalS3Export</code> request.
     */

    public void setStream(JournalKinesisStreamDescription stream) {
        this.stream = stream;
    }

    /**
     * <p>
     * Information about the QLDB journal stream returned by a <code>DescribeJournalS3Export</code> request.
     * </p>
     * 
     * @return Information about the QLDB journal stream returned by a <code>DescribeJournalS3Export</code> request.
     */

    public JournalKinesisStreamDescription getStream() {
        return this.stream;
    }

    /**
     * <p>
     * Information about the QLDB journal stream returned by a <code>DescribeJournalS3Export</code> request.
     * </p>
     * 
     * @param stream
     *        Information about the QLDB journal stream returned by a <code>DescribeJournalS3Export</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJournalKinesisStreamResult withStream(JournalKinesisStreamDescription stream) {
        setStream(stream);
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
        if (getStream() != null)
            sb.append("Stream: ").append(getStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJournalKinesisStreamResult == false)
            return false;
        DescribeJournalKinesisStreamResult other = (DescribeJournalKinesisStreamResult) obj;
        if (other.getStream() == null ^ this.getStream() == null)
            return false;
        if (other.getStream() != null && other.getStream().equals(this.getStream()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStream() == null) ? 0 : getStream().hashCode());
        return hashCode;
    }

    @Override
    public DescribeJournalKinesisStreamResult clone() {
        try {
            return (DescribeJournalKinesisStreamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
