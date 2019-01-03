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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeNodeAssociationStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNodeAssociationStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The status of the association or disassociation request.
     * </p>
     * <p class="title">
     * <b>Possible values:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESS</code>: The association or disassociation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The association or disassociation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The association or disassociation is still in progress.
     * </p>
     * </li>
     * </ul>
     */
    private String nodeAssociationStatus;
    /**
     * <p>
     * Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed
     * certificate (the result of the CSR).
     * </p>
     */
    private java.util.List<EngineAttribute> engineAttributes;

    /**
     * <p>
     * The status of the association or disassociation request.
     * </p>
     * <p class="title">
     * <b>Possible values:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESS</code>: The association or disassociation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The association or disassociation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The association or disassociation is still in progress.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nodeAssociationStatus
     *        The status of the association or disassociation request. </p>
     *        <p class="title">
     *        <b>Possible values:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code>: The association or disassociation succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The association or disassociation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The association or disassociation is still in progress.
     *        </p>
     *        </li>
     * @see NodeAssociationStatus
     */

    public void setNodeAssociationStatus(String nodeAssociationStatus) {
        this.nodeAssociationStatus = nodeAssociationStatus;
    }

    /**
     * <p>
     * The status of the association or disassociation request.
     * </p>
     * <p class="title">
     * <b>Possible values:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESS</code>: The association or disassociation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The association or disassociation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The association or disassociation is still in progress.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the association or disassociation request. </p>
     *         <p class="title">
     *         <b>Possible values:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUCCESS</code>: The association or disassociation succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The association or disassociation failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code>: The association or disassociation is still in progress.
     *         </p>
     *         </li>
     * @see NodeAssociationStatus
     */

    public String getNodeAssociationStatus() {
        return this.nodeAssociationStatus;
    }

    /**
     * <p>
     * The status of the association or disassociation request.
     * </p>
     * <p class="title">
     * <b>Possible values:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESS</code>: The association or disassociation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The association or disassociation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The association or disassociation is still in progress.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nodeAssociationStatus
     *        The status of the association or disassociation request. </p>
     *        <p class="title">
     *        <b>Possible values:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code>: The association or disassociation succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The association or disassociation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The association or disassociation is still in progress.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeAssociationStatus
     */

    public DescribeNodeAssociationStatusResult withNodeAssociationStatus(String nodeAssociationStatus) {
        setNodeAssociationStatus(nodeAssociationStatus);
        return this;
    }

    /**
     * <p>
     * The status of the association or disassociation request.
     * </p>
     * <p class="title">
     * <b>Possible values:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESS</code>: The association or disassociation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The association or disassociation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The association or disassociation is still in progress.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nodeAssociationStatus
     *        The status of the association or disassociation request. </p>
     *        <p class="title">
     *        <b>Possible values:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code>: The association or disassociation succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The association or disassociation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The association or disassociation is still in progress.
     *        </p>
     *        </li>
     * @see NodeAssociationStatus
     */

    public void setNodeAssociationStatus(NodeAssociationStatus nodeAssociationStatus) {
        withNodeAssociationStatus(nodeAssociationStatus);
    }

    /**
     * <p>
     * The status of the association or disassociation request.
     * </p>
     * <p class="title">
     * <b>Possible values:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESS</code>: The association or disassociation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The association or disassociation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The association or disassociation is still in progress.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nodeAssociationStatus
     *        The status of the association or disassociation request. </p>
     *        <p class="title">
     *        <b>Possible values:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code>: The association or disassociation succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The association or disassociation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The association or disassociation is still in progress.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeAssociationStatus
     */

    public DescribeNodeAssociationStatusResult withNodeAssociationStatus(NodeAssociationStatus nodeAssociationStatus) {
        this.nodeAssociationStatus = nodeAssociationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed
     * certificate (the result of the CSR).
     * </p>
     * 
     * @return Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed
     *         certificate (the result of the CSR).
     */

    public java.util.List<EngineAttribute> getEngineAttributes() {
        return engineAttributes;
    }

    /**
     * <p>
     * Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed
     * certificate (the result of the CSR).
     * </p>
     * 
     * @param engineAttributes
     *        Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed
     *        certificate (the result of the CSR).
     */

    public void setEngineAttributes(java.util.Collection<EngineAttribute> engineAttributes) {
        if (engineAttributes == null) {
            this.engineAttributes = null;
            return;
        }

        this.engineAttributes = new java.util.ArrayList<EngineAttribute>(engineAttributes);
    }

    /**
     * <p>
     * Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed
     * certificate (the result of the CSR).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEngineAttributes(java.util.Collection)} or {@link #withEngineAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param engineAttributes
     *        Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed
     *        certificate (the result of the CSR).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeAssociationStatusResult withEngineAttributes(EngineAttribute... engineAttributes) {
        if (this.engineAttributes == null) {
            setEngineAttributes(new java.util.ArrayList<EngineAttribute>(engineAttributes.length));
        }
        for (EngineAttribute ele : engineAttributes) {
            this.engineAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed
     * certificate (the result of the CSR).
     * </p>
     * 
     * @param engineAttributes
     *        Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed
     *        certificate (the result of the CSR).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeAssociationStatusResult withEngineAttributes(java.util.Collection<EngineAttribute> engineAttributes) {
        setEngineAttributes(engineAttributes);
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
        if (getNodeAssociationStatus() != null)
            sb.append("NodeAssociationStatus: ").append(getNodeAssociationStatus()).append(",");
        if (getEngineAttributes() != null)
            sb.append("EngineAttributes: ").append(getEngineAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNodeAssociationStatusResult == false)
            return false;
        DescribeNodeAssociationStatusResult other = (DescribeNodeAssociationStatusResult) obj;
        if (other.getNodeAssociationStatus() == null ^ this.getNodeAssociationStatus() == null)
            return false;
        if (other.getNodeAssociationStatus() != null && other.getNodeAssociationStatus().equals(this.getNodeAssociationStatus()) == false)
            return false;
        if (other.getEngineAttributes() == null ^ this.getEngineAttributes() == null)
            return false;
        if (other.getEngineAttributes() != null && other.getEngineAttributes().equals(this.getEngineAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeAssociationStatus() == null) ? 0 : getNodeAssociationStatus().hashCode());
        hashCode = prime * hashCode + ((getEngineAttributes() == null) ? 0 : getEngineAttributes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNodeAssociationStatusResult clone() {
        try {
            return (DescribeNodeAssociationStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
