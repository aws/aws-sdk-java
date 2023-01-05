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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration defining the action to take when a duplicate fraudster is detected, and the similarity threshold to
 * use for detecting a duplicate fraudster during a batch fraudster registration job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/RegistrationConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistrationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action to take when a fraudster is identified as a duplicate. The default action is <code>SKIP</code>, which
     * skips registering the duplicate fraudster. Setting the value to <code>REGISTER_AS_NEW</code> always registers a
     * new fraudster into the specified domain.
     * </p>
     */
    private String duplicateRegistrationAction;
    /**
     * <p>
     * The minimum similarity score between the new and old fraudsters in order to consider the new fraudster a
     * duplicate.
     * </p>
     */
    private Integer fraudsterSimilarityThreshold;

    /**
     * <p>
     * The action to take when a fraudster is identified as a duplicate. The default action is <code>SKIP</code>, which
     * skips registering the duplicate fraudster. Setting the value to <code>REGISTER_AS_NEW</code> always registers a
     * new fraudster into the specified domain.
     * </p>
     * 
     * @param duplicateRegistrationAction
     *        The action to take when a fraudster is identified as a duplicate. The default action is <code>SKIP</code>,
     *        which skips registering the duplicate fraudster. Setting the value to <code>REGISTER_AS_NEW</code> always
     *        registers a new fraudster into the specified domain.
     * @see DuplicateRegistrationAction
     */

    public void setDuplicateRegistrationAction(String duplicateRegistrationAction) {
        this.duplicateRegistrationAction = duplicateRegistrationAction;
    }

    /**
     * <p>
     * The action to take when a fraudster is identified as a duplicate. The default action is <code>SKIP</code>, which
     * skips registering the duplicate fraudster. Setting the value to <code>REGISTER_AS_NEW</code> always registers a
     * new fraudster into the specified domain.
     * </p>
     * 
     * @return The action to take when a fraudster is identified as a duplicate. The default action is <code>SKIP</code>
     *         , which skips registering the duplicate fraudster. Setting the value to <code>REGISTER_AS_NEW</code>
     *         always registers a new fraudster into the specified domain.
     * @see DuplicateRegistrationAction
     */

    public String getDuplicateRegistrationAction() {
        return this.duplicateRegistrationAction;
    }

    /**
     * <p>
     * The action to take when a fraudster is identified as a duplicate. The default action is <code>SKIP</code>, which
     * skips registering the duplicate fraudster. Setting the value to <code>REGISTER_AS_NEW</code> always registers a
     * new fraudster into the specified domain.
     * </p>
     * 
     * @param duplicateRegistrationAction
     *        The action to take when a fraudster is identified as a duplicate. The default action is <code>SKIP</code>,
     *        which skips registering the duplicate fraudster. Setting the value to <code>REGISTER_AS_NEW</code> always
     *        registers a new fraudster into the specified domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DuplicateRegistrationAction
     */

    public RegistrationConfig withDuplicateRegistrationAction(String duplicateRegistrationAction) {
        setDuplicateRegistrationAction(duplicateRegistrationAction);
        return this;
    }

    /**
     * <p>
     * The action to take when a fraudster is identified as a duplicate. The default action is <code>SKIP</code>, which
     * skips registering the duplicate fraudster. Setting the value to <code>REGISTER_AS_NEW</code> always registers a
     * new fraudster into the specified domain.
     * </p>
     * 
     * @param duplicateRegistrationAction
     *        The action to take when a fraudster is identified as a duplicate. The default action is <code>SKIP</code>,
     *        which skips registering the duplicate fraudster. Setting the value to <code>REGISTER_AS_NEW</code> always
     *        registers a new fraudster into the specified domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DuplicateRegistrationAction
     */

    public RegistrationConfig withDuplicateRegistrationAction(DuplicateRegistrationAction duplicateRegistrationAction) {
        this.duplicateRegistrationAction = duplicateRegistrationAction.toString();
        return this;
    }

    /**
     * <p>
     * The minimum similarity score between the new and old fraudsters in order to consider the new fraudster a
     * duplicate.
     * </p>
     * 
     * @param fraudsterSimilarityThreshold
     *        The minimum similarity score between the new and old fraudsters in order to consider the new fraudster a
     *        duplicate.
     */

    public void setFraudsterSimilarityThreshold(Integer fraudsterSimilarityThreshold) {
        this.fraudsterSimilarityThreshold = fraudsterSimilarityThreshold;
    }

    /**
     * <p>
     * The minimum similarity score between the new and old fraudsters in order to consider the new fraudster a
     * duplicate.
     * </p>
     * 
     * @return The minimum similarity score between the new and old fraudsters in order to consider the new fraudster a
     *         duplicate.
     */

    public Integer getFraudsterSimilarityThreshold() {
        return this.fraudsterSimilarityThreshold;
    }

    /**
     * <p>
     * The minimum similarity score between the new and old fraudsters in order to consider the new fraudster a
     * duplicate.
     * </p>
     * 
     * @param fraudsterSimilarityThreshold
     *        The minimum similarity score between the new and old fraudsters in order to consider the new fraudster a
     *        duplicate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationConfig withFraudsterSimilarityThreshold(Integer fraudsterSimilarityThreshold) {
        setFraudsterSimilarityThreshold(fraudsterSimilarityThreshold);
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
        if (getDuplicateRegistrationAction() != null)
            sb.append("DuplicateRegistrationAction: ").append(getDuplicateRegistrationAction()).append(",");
        if (getFraudsterSimilarityThreshold() != null)
            sb.append("FraudsterSimilarityThreshold: ").append(getFraudsterSimilarityThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegistrationConfig == false)
            return false;
        RegistrationConfig other = (RegistrationConfig) obj;
        if (other.getDuplicateRegistrationAction() == null ^ this.getDuplicateRegistrationAction() == null)
            return false;
        if (other.getDuplicateRegistrationAction() != null && other.getDuplicateRegistrationAction().equals(this.getDuplicateRegistrationAction()) == false)
            return false;
        if (other.getFraudsterSimilarityThreshold() == null ^ this.getFraudsterSimilarityThreshold() == null)
            return false;
        if (other.getFraudsterSimilarityThreshold() != null && other.getFraudsterSimilarityThreshold().equals(this.getFraudsterSimilarityThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDuplicateRegistrationAction() == null) ? 0 : getDuplicateRegistrationAction().hashCode());
        hashCode = prime * hashCode + ((getFraudsterSimilarityThreshold() == null) ? 0 : getFraudsterSimilarityThreshold().hashCode());
        return hashCode;
    }

    @Override
    public RegistrationConfig clone() {
        try {
            return (RegistrationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.RegistrationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
