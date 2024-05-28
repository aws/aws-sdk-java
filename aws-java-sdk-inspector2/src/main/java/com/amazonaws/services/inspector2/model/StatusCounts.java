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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status counts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/StatusCounts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatusCounts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of checks that failed.
     * </p>
     */
    private Integer failed;
    /**
     * <p>
     * The number of checks that passed.
     * </p>
     */
    private Integer passed;
    /**
     * <p>
     * The number of checks that were skipped.
     * </p>
     */
    private Integer skipped;

    /**
     * <p>
     * The number of checks that failed.
     * </p>
     * 
     * @param failed
     *        The number of checks that failed.
     */

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**
     * <p>
     * The number of checks that failed.
     * </p>
     * 
     * @return The number of checks that failed.
     */

    public Integer getFailed() {
        return this.failed;
    }

    /**
     * <p>
     * The number of checks that failed.
     * </p>
     * 
     * @param failed
     *        The number of checks that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatusCounts withFailed(Integer failed) {
        setFailed(failed);
        return this;
    }

    /**
     * <p>
     * The number of checks that passed.
     * </p>
     * 
     * @param passed
     *        The number of checks that passed.
     */

    public void setPassed(Integer passed) {
        this.passed = passed;
    }

    /**
     * <p>
     * The number of checks that passed.
     * </p>
     * 
     * @return The number of checks that passed.
     */

    public Integer getPassed() {
        return this.passed;
    }

    /**
     * <p>
     * The number of checks that passed.
     * </p>
     * 
     * @param passed
     *        The number of checks that passed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatusCounts withPassed(Integer passed) {
        setPassed(passed);
        return this;
    }

    /**
     * <p>
     * The number of checks that were skipped.
     * </p>
     * 
     * @param skipped
     *        The number of checks that were skipped.
     */

    public void setSkipped(Integer skipped) {
        this.skipped = skipped;
    }

    /**
     * <p>
     * The number of checks that were skipped.
     * </p>
     * 
     * @return The number of checks that were skipped.
     */

    public Integer getSkipped() {
        return this.skipped;
    }

    /**
     * <p>
     * The number of checks that were skipped.
     * </p>
     * 
     * @param skipped
     *        The number of checks that were skipped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatusCounts withSkipped(Integer skipped) {
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
        if (getFailed() != null)
            sb.append("Failed: ").append(getFailed()).append(",");
        if (getPassed() != null)
            sb.append("Passed: ").append(getPassed()).append(",");
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

        if (obj instanceof StatusCounts == false)
            return false;
        StatusCounts other = (StatusCounts) obj;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        if (other.getPassed() == null ^ this.getPassed() == null)
            return false;
        if (other.getPassed() != null && other.getPassed().equals(this.getPassed()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        hashCode = prime * hashCode + ((getPassed() == null) ? 0 : getPassed().hashCode());
        hashCode = prime * hashCode + ((getSkipped() == null) ? 0 : getSkipped().hashCode());
        return hashCode;
    }

    @Override
    public StatusCounts clone() {
        try {
            return (StatusCounts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.StatusCountsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
