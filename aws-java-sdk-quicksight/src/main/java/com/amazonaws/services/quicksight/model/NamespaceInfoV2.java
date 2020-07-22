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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The error type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NamespaceInfoV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NamespaceInfoV2 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the error.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The namespace ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The namespace AWS Region.
     * </p>
     */
    private String capacityRegion;
    /**
     * <p>
     * The creation status of a namespace that is not yet completely created.
     * </p>
     */
    private String creationStatus;
    /**
     * <p>
     * The identity store used for the namespace.
     * </p>
     */
    private String identityStore;
    /**
     * <p>
     * An error that occured when the namespace was created.
     * </p>
     */
    private NamespaceError namespaceError;

    /**
     * <p>
     * The name of the error.
     * </p>
     * 
     * @param name
     *        The name of the error.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the error.
     * </p>
     * 
     * @return The name of the error.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the error.
     * </p>
     * 
     * @param name
     *        The name of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceInfoV2 withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The namespace ARN.
     * </p>
     * 
     * @param arn
     *        The namespace ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The namespace ARN.
     * </p>
     * 
     * @return The namespace ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The namespace ARN.
     * </p>
     * 
     * @param arn
     *        The namespace ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceInfoV2 withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The namespace AWS Region.
     * </p>
     * 
     * @param capacityRegion
     *        The namespace AWS Region.
     */

    public void setCapacityRegion(String capacityRegion) {
        this.capacityRegion = capacityRegion;
    }

    /**
     * <p>
     * The namespace AWS Region.
     * </p>
     * 
     * @return The namespace AWS Region.
     */

    public String getCapacityRegion() {
        return this.capacityRegion;
    }

    /**
     * <p>
     * The namespace AWS Region.
     * </p>
     * 
     * @param capacityRegion
     *        The namespace AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceInfoV2 withCapacityRegion(String capacityRegion) {
        setCapacityRegion(capacityRegion);
        return this;
    }

    /**
     * <p>
     * The creation status of a namespace that is not yet completely created.
     * </p>
     * 
     * @param creationStatus
     *        The creation status of a namespace that is not yet completely created.
     * @see NamespaceStatus
     */

    public void setCreationStatus(String creationStatus) {
        this.creationStatus = creationStatus;
    }

    /**
     * <p>
     * The creation status of a namespace that is not yet completely created.
     * </p>
     * 
     * @return The creation status of a namespace that is not yet completely created.
     * @see NamespaceStatus
     */

    public String getCreationStatus() {
        return this.creationStatus;
    }

    /**
     * <p>
     * The creation status of a namespace that is not yet completely created.
     * </p>
     * 
     * @param creationStatus
     *        The creation status of a namespace that is not yet completely created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamespaceStatus
     */

    public NamespaceInfoV2 withCreationStatus(String creationStatus) {
        setCreationStatus(creationStatus);
        return this;
    }

    /**
     * <p>
     * The creation status of a namespace that is not yet completely created.
     * </p>
     * 
     * @param creationStatus
     *        The creation status of a namespace that is not yet completely created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamespaceStatus
     */

    public NamespaceInfoV2 withCreationStatus(NamespaceStatus creationStatus) {
        this.creationStatus = creationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The identity store used for the namespace.
     * </p>
     * 
     * @param identityStore
     *        The identity store used for the namespace.
     * @see IdentityStore
     */

    public void setIdentityStore(String identityStore) {
        this.identityStore = identityStore;
    }

    /**
     * <p>
     * The identity store used for the namespace.
     * </p>
     * 
     * @return The identity store used for the namespace.
     * @see IdentityStore
     */

    public String getIdentityStore() {
        return this.identityStore;
    }

    /**
     * <p>
     * The identity store used for the namespace.
     * </p>
     * 
     * @param identityStore
     *        The identity store used for the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityStore
     */

    public NamespaceInfoV2 withIdentityStore(String identityStore) {
        setIdentityStore(identityStore);
        return this;
    }

    /**
     * <p>
     * The identity store used for the namespace.
     * </p>
     * 
     * @param identityStore
     *        The identity store used for the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityStore
     */

    public NamespaceInfoV2 withIdentityStore(IdentityStore identityStore) {
        this.identityStore = identityStore.toString();
        return this;
    }

    /**
     * <p>
     * An error that occured when the namespace was created.
     * </p>
     * 
     * @param namespaceError
     *        An error that occured when the namespace was created.
     */

    public void setNamespaceError(NamespaceError namespaceError) {
        this.namespaceError = namespaceError;
    }

    /**
     * <p>
     * An error that occured when the namespace was created.
     * </p>
     * 
     * @return An error that occured when the namespace was created.
     */

    public NamespaceError getNamespaceError() {
        return this.namespaceError;
    }

    /**
     * <p>
     * An error that occured when the namespace was created.
     * </p>
     * 
     * @param namespaceError
     *        An error that occured when the namespace was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceInfoV2 withNamespaceError(NamespaceError namespaceError) {
        setNamespaceError(namespaceError);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCapacityRegion() != null)
            sb.append("CapacityRegion: ").append(getCapacityRegion()).append(",");
        if (getCreationStatus() != null)
            sb.append("CreationStatus: ").append(getCreationStatus()).append(",");
        if (getIdentityStore() != null)
            sb.append("IdentityStore: ").append(getIdentityStore()).append(",");
        if (getNamespaceError() != null)
            sb.append("NamespaceError: ").append(getNamespaceError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NamespaceInfoV2 == false)
            return false;
        NamespaceInfoV2 other = (NamespaceInfoV2) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCapacityRegion() == null ^ this.getCapacityRegion() == null)
            return false;
        if (other.getCapacityRegion() != null && other.getCapacityRegion().equals(this.getCapacityRegion()) == false)
            return false;
        if (other.getCreationStatus() == null ^ this.getCreationStatus() == null)
            return false;
        if (other.getCreationStatus() != null && other.getCreationStatus().equals(this.getCreationStatus()) == false)
            return false;
        if (other.getIdentityStore() == null ^ this.getIdentityStore() == null)
            return false;
        if (other.getIdentityStore() != null && other.getIdentityStore().equals(this.getIdentityStore()) == false)
            return false;
        if (other.getNamespaceError() == null ^ this.getNamespaceError() == null)
            return false;
        if (other.getNamespaceError() != null && other.getNamespaceError().equals(this.getNamespaceError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCapacityRegion() == null) ? 0 : getCapacityRegion().hashCode());
        hashCode = prime * hashCode + ((getCreationStatus() == null) ? 0 : getCreationStatus().hashCode());
        hashCode = prime * hashCode + ((getIdentityStore() == null) ? 0 : getIdentityStore().hashCode());
        hashCode = prime * hashCode + ((getNamespaceError() == null) ? 0 : getNamespaceError().hashCode());
        return hashCode;
    }

    @Override
    public NamespaceInfoV2 clone() {
        try {
            return (NamespaceInfoV2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NamespaceInfoV2Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
