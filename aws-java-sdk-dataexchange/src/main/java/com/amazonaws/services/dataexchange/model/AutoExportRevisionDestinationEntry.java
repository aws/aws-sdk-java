/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A revision destination is the Amazon S3 bucket folder destination to where the export will be sent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/AutoExportRevisionDestinationEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoExportRevisionDestinationEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket that is the destination for the event action.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * A string representing the pattern for generated names of the individual assets in the revision. For more
     * information about key patterns, see <a
     * href="https://docs.aws.amazon.com/data-exchange/latest/userguide/jobs.html#revision-export-keypatterns">Key
     * patterns when exporting revisions</a>.
     * </p>
     */
    private String keyPattern;

    /**
     * <p>
     * The Amazon S3 bucket that is the destination for the event action.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket that is the destination for the event action.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that is the destination for the event action.
     * </p>
     * 
     * @return The Amazon S3 bucket that is the destination for the event action.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that is the destination for the event action.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket that is the destination for the event action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoExportRevisionDestinationEntry withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * A string representing the pattern for generated names of the individual assets in the revision. For more
     * information about key patterns, see <a
     * href="https://docs.aws.amazon.com/data-exchange/latest/userguide/jobs.html#revision-export-keypatterns">Key
     * patterns when exporting revisions</a>.
     * </p>
     * 
     * @param keyPattern
     *        A string representing the pattern for generated names of the individual assets in the revision. For more
     *        information about key patterns, see <a
     *        href="https://docs.aws.amazon.com/data-exchange/latest/userguide/jobs.html#revision-export-keypatterns"
     *        >Key patterns when exporting revisions</a>.
     */

    public void setKeyPattern(String keyPattern) {
        this.keyPattern = keyPattern;
    }

    /**
     * <p>
     * A string representing the pattern for generated names of the individual assets in the revision. For more
     * information about key patterns, see <a
     * href="https://docs.aws.amazon.com/data-exchange/latest/userguide/jobs.html#revision-export-keypatterns">Key
     * patterns when exporting revisions</a>.
     * </p>
     * 
     * @return A string representing the pattern for generated names of the individual assets in the revision. For more
     *         information about key patterns, see <a
     *         href="https://docs.aws.amazon.com/data-exchange/latest/userguide/jobs.html#revision-export-keypatterns"
     *         >Key patterns when exporting revisions</a>.
     */

    public String getKeyPattern() {
        return this.keyPattern;
    }

    /**
     * <p>
     * A string representing the pattern for generated names of the individual assets in the revision. For more
     * information about key patterns, see <a
     * href="https://docs.aws.amazon.com/data-exchange/latest/userguide/jobs.html#revision-export-keypatterns">Key
     * patterns when exporting revisions</a>.
     * </p>
     * 
     * @param keyPattern
     *        A string representing the pattern for generated names of the individual assets in the revision. For more
     *        information about key patterns, see <a
     *        href="https://docs.aws.amazon.com/data-exchange/latest/userguide/jobs.html#revision-export-keypatterns"
     *        >Key patterns when exporting revisions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoExportRevisionDestinationEntry withKeyPattern(String keyPattern) {
        setKeyPattern(keyPattern);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getKeyPattern() != null)
            sb.append("KeyPattern: ").append(getKeyPattern());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoExportRevisionDestinationEntry == false)
            return false;
        AutoExportRevisionDestinationEntry other = (AutoExportRevisionDestinationEntry) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKeyPattern() == null ^ this.getKeyPattern() == null)
            return false;
        if (other.getKeyPattern() != null && other.getKeyPattern().equals(this.getKeyPattern()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKeyPattern() == null) ? 0 : getKeyPattern().hashCode());
        return hashCode;
    }

    @Override
    public AutoExportRevisionDestinationEntry clone() {
        try {
            return (AutoExportRevisionDestinationEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.AutoExportRevisionDestinationEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
