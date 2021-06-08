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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lifecycle.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/LifeCycle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifeCycle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lifecycle added to service data and time.
     * </p>
     */
    private String addedToServiceDateTime;
    /**
     * <p>
     * Lifecycle elapsed time and duration.
     * </p>
     */
    private String elapsedReplicationDuration;
    /**
     * <p>
     * Lifecycle replication initiation date and time.
     * </p>
     */
    private String firstByteDateTime;
    /**
     * <p>
     * Lifecycle last Cutover.
     * </p>
     */
    private LifeCycleLastCutover lastCutover;
    /**
     * <p>
     * Lifecycle last seen date and time.
     * </p>
     */
    private String lastSeenByServiceDateTime;
    /**
     * <p>
     * Lifecycle last Test.
     * </p>
     */
    private LifeCycleLastTest lastTest;
    /**
     * <p>
     * Lifecycle state.
     * </p>
     */
    private String state;

    /**
     * <p>
     * Lifecycle added to service data and time.
     * </p>
     * 
     * @param addedToServiceDateTime
     *        Lifecycle added to service data and time.
     */

    public void setAddedToServiceDateTime(String addedToServiceDateTime) {
        this.addedToServiceDateTime = addedToServiceDateTime;
    }

    /**
     * <p>
     * Lifecycle added to service data and time.
     * </p>
     * 
     * @return Lifecycle added to service data and time.
     */

    public String getAddedToServiceDateTime() {
        return this.addedToServiceDateTime;
    }

    /**
     * <p>
     * Lifecycle added to service data and time.
     * </p>
     * 
     * @param addedToServiceDateTime
     *        Lifecycle added to service data and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycle withAddedToServiceDateTime(String addedToServiceDateTime) {
        setAddedToServiceDateTime(addedToServiceDateTime);
        return this;
    }

    /**
     * <p>
     * Lifecycle elapsed time and duration.
     * </p>
     * 
     * @param elapsedReplicationDuration
     *        Lifecycle elapsed time and duration.
     */

    public void setElapsedReplicationDuration(String elapsedReplicationDuration) {
        this.elapsedReplicationDuration = elapsedReplicationDuration;
    }

    /**
     * <p>
     * Lifecycle elapsed time and duration.
     * </p>
     * 
     * @return Lifecycle elapsed time and duration.
     */

    public String getElapsedReplicationDuration() {
        return this.elapsedReplicationDuration;
    }

    /**
     * <p>
     * Lifecycle elapsed time and duration.
     * </p>
     * 
     * @param elapsedReplicationDuration
     *        Lifecycle elapsed time and duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycle withElapsedReplicationDuration(String elapsedReplicationDuration) {
        setElapsedReplicationDuration(elapsedReplicationDuration);
        return this;
    }

    /**
     * <p>
     * Lifecycle replication initiation date and time.
     * </p>
     * 
     * @param firstByteDateTime
     *        Lifecycle replication initiation date and time.
     */

    public void setFirstByteDateTime(String firstByteDateTime) {
        this.firstByteDateTime = firstByteDateTime;
    }

    /**
     * <p>
     * Lifecycle replication initiation date and time.
     * </p>
     * 
     * @return Lifecycle replication initiation date and time.
     */

    public String getFirstByteDateTime() {
        return this.firstByteDateTime;
    }

    /**
     * <p>
     * Lifecycle replication initiation date and time.
     * </p>
     * 
     * @param firstByteDateTime
     *        Lifecycle replication initiation date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycle withFirstByteDateTime(String firstByteDateTime) {
        setFirstByteDateTime(firstByteDateTime);
        return this;
    }

    /**
     * <p>
     * Lifecycle last Cutover.
     * </p>
     * 
     * @param lastCutover
     *        Lifecycle last Cutover.
     */

    public void setLastCutover(LifeCycleLastCutover lastCutover) {
        this.lastCutover = lastCutover;
    }

    /**
     * <p>
     * Lifecycle last Cutover.
     * </p>
     * 
     * @return Lifecycle last Cutover.
     */

    public LifeCycleLastCutover getLastCutover() {
        return this.lastCutover;
    }

    /**
     * <p>
     * Lifecycle last Cutover.
     * </p>
     * 
     * @param lastCutover
     *        Lifecycle last Cutover.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycle withLastCutover(LifeCycleLastCutover lastCutover) {
        setLastCutover(lastCutover);
        return this;
    }

    /**
     * <p>
     * Lifecycle last seen date and time.
     * </p>
     * 
     * @param lastSeenByServiceDateTime
     *        Lifecycle last seen date and time.
     */

    public void setLastSeenByServiceDateTime(String lastSeenByServiceDateTime) {
        this.lastSeenByServiceDateTime = lastSeenByServiceDateTime;
    }

    /**
     * <p>
     * Lifecycle last seen date and time.
     * </p>
     * 
     * @return Lifecycle last seen date and time.
     */

    public String getLastSeenByServiceDateTime() {
        return this.lastSeenByServiceDateTime;
    }

    /**
     * <p>
     * Lifecycle last seen date and time.
     * </p>
     * 
     * @param lastSeenByServiceDateTime
     *        Lifecycle last seen date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycle withLastSeenByServiceDateTime(String lastSeenByServiceDateTime) {
        setLastSeenByServiceDateTime(lastSeenByServiceDateTime);
        return this;
    }

    /**
     * <p>
     * Lifecycle last Test.
     * </p>
     * 
     * @param lastTest
     *        Lifecycle last Test.
     */

    public void setLastTest(LifeCycleLastTest lastTest) {
        this.lastTest = lastTest;
    }

    /**
     * <p>
     * Lifecycle last Test.
     * </p>
     * 
     * @return Lifecycle last Test.
     */

    public LifeCycleLastTest getLastTest() {
        return this.lastTest;
    }

    /**
     * <p>
     * Lifecycle last Test.
     * </p>
     * 
     * @param lastTest
     *        Lifecycle last Test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycle withLastTest(LifeCycleLastTest lastTest) {
        setLastTest(lastTest);
        return this;
    }

    /**
     * <p>
     * Lifecycle state.
     * </p>
     * 
     * @param state
     *        Lifecycle state.
     * @see LifeCycleState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Lifecycle state.
     * </p>
     * 
     * @return Lifecycle state.
     * @see LifeCycleState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Lifecycle state.
     * </p>
     * 
     * @param state
     *        Lifecycle state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifeCycleState
     */

    public LifeCycle withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Lifecycle state.
     * </p>
     * 
     * @param state
     *        Lifecycle state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifeCycleState
     */

    public LifeCycle withState(LifeCycleState state) {
        this.state = state.toString();
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
        if (getAddedToServiceDateTime() != null)
            sb.append("AddedToServiceDateTime: ").append(getAddedToServiceDateTime()).append(",");
        if (getElapsedReplicationDuration() != null)
            sb.append("ElapsedReplicationDuration: ").append(getElapsedReplicationDuration()).append(",");
        if (getFirstByteDateTime() != null)
            sb.append("FirstByteDateTime: ").append(getFirstByteDateTime()).append(",");
        if (getLastCutover() != null)
            sb.append("LastCutover: ").append(getLastCutover()).append(",");
        if (getLastSeenByServiceDateTime() != null)
            sb.append("LastSeenByServiceDateTime: ").append(getLastSeenByServiceDateTime()).append(",");
        if (getLastTest() != null)
            sb.append("LastTest: ").append(getLastTest()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifeCycle == false)
            return false;
        LifeCycle other = (LifeCycle) obj;
        if (other.getAddedToServiceDateTime() == null ^ this.getAddedToServiceDateTime() == null)
            return false;
        if (other.getAddedToServiceDateTime() != null && other.getAddedToServiceDateTime().equals(this.getAddedToServiceDateTime()) == false)
            return false;
        if (other.getElapsedReplicationDuration() == null ^ this.getElapsedReplicationDuration() == null)
            return false;
        if (other.getElapsedReplicationDuration() != null && other.getElapsedReplicationDuration().equals(this.getElapsedReplicationDuration()) == false)
            return false;
        if (other.getFirstByteDateTime() == null ^ this.getFirstByteDateTime() == null)
            return false;
        if (other.getFirstByteDateTime() != null && other.getFirstByteDateTime().equals(this.getFirstByteDateTime()) == false)
            return false;
        if (other.getLastCutover() == null ^ this.getLastCutover() == null)
            return false;
        if (other.getLastCutover() != null && other.getLastCutover().equals(this.getLastCutover()) == false)
            return false;
        if (other.getLastSeenByServiceDateTime() == null ^ this.getLastSeenByServiceDateTime() == null)
            return false;
        if (other.getLastSeenByServiceDateTime() != null && other.getLastSeenByServiceDateTime().equals(this.getLastSeenByServiceDateTime()) == false)
            return false;
        if (other.getLastTest() == null ^ this.getLastTest() == null)
            return false;
        if (other.getLastTest() != null && other.getLastTest().equals(this.getLastTest()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddedToServiceDateTime() == null) ? 0 : getAddedToServiceDateTime().hashCode());
        hashCode = prime * hashCode + ((getElapsedReplicationDuration() == null) ? 0 : getElapsedReplicationDuration().hashCode());
        hashCode = prime * hashCode + ((getFirstByteDateTime() == null) ? 0 : getFirstByteDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastCutover() == null) ? 0 : getLastCutover().hashCode());
        hashCode = prime * hashCode + ((getLastSeenByServiceDateTime() == null) ? 0 : getLastSeenByServiceDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastTest() == null) ? 0 : getLastTest().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public LifeCycle clone() {
        try {
            return (LifeCycle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.LifeCycleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
