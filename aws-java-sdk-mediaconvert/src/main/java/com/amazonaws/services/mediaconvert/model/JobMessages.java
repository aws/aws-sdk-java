/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Provides messages from the service about jobs that you have already successfully submitted.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/JobMessages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobMessages implements Serializable, Cloneable, StructuredPojo {

    /** List of messages that are informational only and don't indicate a problem with your job. */
    private java.util.List<String> info;
    /** List of messages that warn about conditions that might cause your job not to run or to fail. */
    private java.util.List<String> warning;

    /**
     * List of messages that are informational only and don't indicate a problem with your job.
     * 
     * @return List of messages that are informational only and don't indicate a problem with your job.
     */

    public java.util.List<String> getInfo() {
        return info;
    }

    /**
     * List of messages that are informational only and don't indicate a problem with your job.
     * 
     * @param info
     *        List of messages that are informational only and don't indicate a problem with your job.
     */

    public void setInfo(java.util.Collection<String> info) {
        if (info == null) {
            this.info = null;
            return;
        }

        this.info = new java.util.ArrayList<String>(info);
    }

    /**
     * List of messages that are informational only and don't indicate a problem with your job.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInfo(java.util.Collection)} or {@link #withInfo(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param info
     *        List of messages that are informational only and don't indicate a problem with your job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobMessages withInfo(String... info) {
        if (this.info == null) {
            setInfo(new java.util.ArrayList<String>(info.length));
        }
        for (String ele : info) {
            this.info.add(ele);
        }
        return this;
    }

    /**
     * List of messages that are informational only and don't indicate a problem with your job.
     * 
     * @param info
     *        List of messages that are informational only and don't indicate a problem with your job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobMessages withInfo(java.util.Collection<String> info) {
        setInfo(info);
        return this;
    }

    /**
     * List of messages that warn about conditions that might cause your job not to run or to fail.
     * 
     * @return List of messages that warn about conditions that might cause your job not to run or to fail.
     */

    public java.util.List<String> getWarning() {
        return warning;
    }

    /**
     * List of messages that warn about conditions that might cause your job not to run or to fail.
     * 
     * @param warning
     *        List of messages that warn about conditions that might cause your job not to run or to fail.
     */

    public void setWarning(java.util.Collection<String> warning) {
        if (warning == null) {
            this.warning = null;
            return;
        }

        this.warning = new java.util.ArrayList<String>(warning);
    }

    /**
     * List of messages that warn about conditions that might cause your job not to run or to fail.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWarning(java.util.Collection)} or {@link #withWarning(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param warning
     *        List of messages that warn about conditions that might cause your job not to run or to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobMessages withWarning(String... warning) {
        if (this.warning == null) {
            setWarning(new java.util.ArrayList<String>(warning.length));
        }
        for (String ele : warning) {
            this.warning.add(ele);
        }
        return this;
    }

    /**
     * List of messages that warn about conditions that might cause your job not to run or to fail.
     * 
     * @param warning
     *        List of messages that warn about conditions that might cause your job not to run or to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobMessages withWarning(java.util.Collection<String> warning) {
        setWarning(warning);
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
        if (getInfo() != null)
            sb.append("Info: ").append(getInfo()).append(",");
        if (getWarning() != null)
            sb.append("Warning: ").append(getWarning());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobMessages == false)
            return false;
        JobMessages other = (JobMessages) obj;
        if (other.getInfo() == null ^ this.getInfo() == null)
            return false;
        if (other.getInfo() != null && other.getInfo().equals(this.getInfo()) == false)
            return false;
        if (other.getWarning() == null ^ this.getWarning() == null)
            return false;
        if (other.getWarning() != null && other.getWarning().equals(this.getWarning()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInfo() == null) ? 0 : getInfo().hashCode());
        hashCode = prime * hashCode + ((getWarning() == null) ? 0 : getWarning().hashCode());
        return hashCode;
    }

    @Override
    public JobMessages clone() {
        try {
            return (JobMessages) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.JobMessagesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
