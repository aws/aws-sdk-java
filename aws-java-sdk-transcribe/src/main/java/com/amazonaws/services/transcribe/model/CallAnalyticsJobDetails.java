/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about a call analytics job, including information about skipped analytics features.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CallAnalyticsJobDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CallAnalyticsJobDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information about any skipped analytics features during the analysis of a call analytics job.
     * </p>
     * <p>
     * This array lists all the analytics features that were skipped, along with their corresponding reason code and
     * message.
     * </p>
     */
    private java.util.List<CallAnalyticsSkippedFeature> skipped;

    /**
     * <p>
     * Contains information about any skipped analytics features during the analysis of a call analytics job.
     * </p>
     * <p>
     * This array lists all the analytics features that were skipped, along with their corresponding reason code and
     * message.
     * </p>
     * 
     * @return Contains information about any skipped analytics features during the analysis of a call analytics
     *         job.</p>
     *         <p>
     *         This array lists all the analytics features that were skipped, along with their corresponding reason code
     *         and message.
     */

    public java.util.List<CallAnalyticsSkippedFeature> getSkipped() {
        return skipped;
    }

    /**
     * <p>
     * Contains information about any skipped analytics features during the analysis of a call analytics job.
     * </p>
     * <p>
     * This array lists all the analytics features that were skipped, along with their corresponding reason code and
     * message.
     * </p>
     * 
     * @param skipped
     *        Contains information about any skipped analytics features during the analysis of a call analytics job.</p>
     *        <p>
     *        This array lists all the analytics features that were skipped, along with their corresponding reason code
     *        and message.
     */

    public void setSkipped(java.util.Collection<CallAnalyticsSkippedFeature> skipped) {
        if (skipped == null) {
            this.skipped = null;
            return;
        }

        this.skipped = new java.util.ArrayList<CallAnalyticsSkippedFeature>(skipped);
    }

    /**
     * <p>
     * Contains information about any skipped analytics features during the analysis of a call analytics job.
     * </p>
     * <p>
     * This array lists all the analytics features that were skipped, along with their corresponding reason code and
     * message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSkipped(java.util.Collection)} or {@link #withSkipped(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param skipped
     *        Contains information about any skipped analytics features during the analysis of a call analytics job.</p>
     *        <p>
     *        This array lists all the analytics features that were skipped, along with their corresponding reason code
     *        and message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJobDetails withSkipped(CallAnalyticsSkippedFeature... skipped) {
        if (this.skipped == null) {
            setSkipped(new java.util.ArrayList<CallAnalyticsSkippedFeature>(skipped.length));
        }
        for (CallAnalyticsSkippedFeature ele : skipped) {
            this.skipped.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about any skipped analytics features during the analysis of a call analytics job.
     * </p>
     * <p>
     * This array lists all the analytics features that were skipped, along with their corresponding reason code and
     * message.
     * </p>
     * 
     * @param skipped
     *        Contains information about any skipped analytics features during the analysis of a call analytics job.</p>
     *        <p>
     *        This array lists all the analytics features that were skipped, along with their corresponding reason code
     *        and message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJobDetails withSkipped(java.util.Collection<CallAnalyticsSkippedFeature> skipped) {
        setSkipped(skipped);
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
        if (getSkipped() != null)
            sb.append("Skipped: ").append(getSkipped());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CallAnalyticsJobDetails == false)
            return false;
        CallAnalyticsJobDetails other = (CallAnalyticsJobDetails) obj;
        if (other.getSkipped() == null ^ this.getSkipped() == null)
            return false;
        if (other.getSkipped() != null && other.getSkipped().equals(this.getSkipped()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkipped() == null) ? 0 : getSkipped().hashCode());
        return hashCode;
    }

    @Override
    public CallAnalyticsJobDetails clone() {
        try {
            return (CallAnalyticsJobDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.CallAnalyticsJobDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
