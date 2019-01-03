/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents entity counters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/Counters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Counters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of entities.
     * </p>
     */
    private Integer total;
    /**
     * <p>
     * The number of passed entities.
     * </p>
     */
    private Integer passed;
    /**
     * <p>
     * The number of failed entities.
     * </p>
     */
    private Integer failed;
    /**
     * <p>
     * The number of warned entities.
     * </p>
     */
    private Integer warned;
    /**
     * <p>
     * The number of errored entities.
     * </p>
     */
    private Integer errored;
    /**
     * <p>
     * The number of stopped entities.
     * </p>
     */
    private Integer stopped;
    /**
     * <p>
     * The number of skipped entities.
     * </p>
     */
    private Integer skipped;

    /**
     * <p>
     * The total number of entities.
     * </p>
     * 
     * @param total
     *        The total number of entities.
     */

    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * <p>
     * The total number of entities.
     * </p>
     * 
     * @return The total number of entities.
     */

    public Integer getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total number of entities.
     * </p>
     * 
     * @param total
     *        The total number of entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Counters withTotal(Integer total) {
        setTotal(total);
        return this;
    }

    /**
     * <p>
     * The number of passed entities.
     * </p>
     * 
     * @param passed
     *        The number of passed entities.
     */

    public void setPassed(Integer passed) {
        this.passed = passed;
    }

    /**
     * <p>
     * The number of passed entities.
     * </p>
     * 
     * @return The number of passed entities.
     */

    public Integer getPassed() {
        return this.passed;
    }

    /**
     * <p>
     * The number of passed entities.
     * </p>
     * 
     * @param passed
     *        The number of passed entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Counters withPassed(Integer passed) {
        setPassed(passed);
        return this;
    }

    /**
     * <p>
     * The number of failed entities.
     * </p>
     * 
     * @param failed
     *        The number of failed entities.
     */

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**
     * <p>
     * The number of failed entities.
     * </p>
     * 
     * @return The number of failed entities.
     */

    public Integer getFailed() {
        return this.failed;
    }

    /**
     * <p>
     * The number of failed entities.
     * </p>
     * 
     * @param failed
     *        The number of failed entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Counters withFailed(Integer failed) {
        setFailed(failed);
        return this;
    }

    /**
     * <p>
     * The number of warned entities.
     * </p>
     * 
     * @param warned
     *        The number of warned entities.
     */

    public void setWarned(Integer warned) {
        this.warned = warned;
    }

    /**
     * <p>
     * The number of warned entities.
     * </p>
     * 
     * @return The number of warned entities.
     */

    public Integer getWarned() {
        return this.warned;
    }

    /**
     * <p>
     * The number of warned entities.
     * </p>
     * 
     * @param warned
     *        The number of warned entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Counters withWarned(Integer warned) {
        setWarned(warned);
        return this;
    }

    /**
     * <p>
     * The number of errored entities.
     * </p>
     * 
     * @param errored
     *        The number of errored entities.
     */

    public void setErrored(Integer errored) {
        this.errored = errored;
    }

    /**
     * <p>
     * The number of errored entities.
     * </p>
     * 
     * @return The number of errored entities.
     */

    public Integer getErrored() {
        return this.errored;
    }

    /**
     * <p>
     * The number of errored entities.
     * </p>
     * 
     * @param errored
     *        The number of errored entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Counters withErrored(Integer errored) {
        setErrored(errored);
        return this;
    }

    /**
     * <p>
     * The number of stopped entities.
     * </p>
     * 
     * @param stopped
     *        The number of stopped entities.
     */

    public void setStopped(Integer stopped) {
        this.stopped = stopped;
    }

    /**
     * <p>
     * The number of stopped entities.
     * </p>
     * 
     * @return The number of stopped entities.
     */

    public Integer getStopped() {
        return this.stopped;
    }

    /**
     * <p>
     * The number of stopped entities.
     * </p>
     * 
     * @param stopped
     *        The number of stopped entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Counters withStopped(Integer stopped) {
        setStopped(stopped);
        return this;
    }

    /**
     * <p>
     * The number of skipped entities.
     * </p>
     * 
     * @param skipped
     *        The number of skipped entities.
     */

    public void setSkipped(Integer skipped) {
        this.skipped = skipped;
    }

    /**
     * <p>
     * The number of skipped entities.
     * </p>
     * 
     * @return The number of skipped entities.
     */

    public Integer getSkipped() {
        return this.skipped;
    }

    /**
     * <p>
     * The number of skipped entities.
     * </p>
     * 
     * @param skipped
     *        The number of skipped entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Counters withSkipped(Integer skipped) {
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
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal()).append(",");
        if (getPassed() != null)
            sb.append("Passed: ").append(getPassed()).append(",");
        if (getFailed() != null)
            sb.append("Failed: ").append(getFailed()).append(",");
        if (getWarned() != null)
            sb.append("Warned: ").append(getWarned()).append(",");
        if (getErrored() != null)
            sb.append("Errored: ").append(getErrored()).append(",");
        if (getStopped() != null)
            sb.append("Stopped: ").append(getStopped()).append(",");
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

        if (obj instanceof Counters == false)
            return false;
        Counters other = (Counters) obj;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getPassed() == null ^ this.getPassed() == null)
            return false;
        if (other.getPassed() != null && other.getPassed().equals(this.getPassed()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        if (other.getWarned() == null ^ this.getWarned() == null)
            return false;
        if (other.getWarned() != null && other.getWarned().equals(this.getWarned()) == false)
            return false;
        if (other.getErrored() == null ^ this.getErrored() == null)
            return false;
        if (other.getErrored() != null && other.getErrored().equals(this.getErrored()) == false)
            return false;
        if (other.getStopped() == null ^ this.getStopped() == null)
            return false;
        if (other.getStopped() != null && other.getStopped().equals(this.getStopped()) == false)
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

        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getPassed() == null) ? 0 : getPassed().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        hashCode = prime * hashCode + ((getWarned() == null) ? 0 : getWarned().hashCode());
        hashCode = prime * hashCode + ((getErrored() == null) ? 0 : getErrored().hashCode());
        hashCode = prime * hashCode + ((getStopped() == null) ? 0 : getStopped().hashCode());
        hashCode = prime * hashCode + ((getSkipped() == null) ? 0 : getSkipped().hashCode());
        return hashCode;
    }

    @Override
    public Counters clone() {
        try {
            return (Counters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.CountersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
