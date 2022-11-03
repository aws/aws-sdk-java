/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of your local Amazon EKS cluster on an Amazon Web Services Outpost. Before creating a cluster on an
 * Outpost, review <a href="https://docs.aws.amazon.com/eks/latest/userguide/create-cluster-outpost.html">Creating a
 * local Amazon EKS cluster on an Amazon Web Services Outpost</a> in the <i>Amazon EKS User Guide</i>. This API isn't
 * available for Amazon EKS clusters on the Amazon Web Services cloud.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/OutpostConfigRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutpostConfigRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Outpost that you want to use for your local Amazon EKS cluster on Outposts. Only a single Outpost
     * ARN is supported.
     * </p>
     */
    private java.util.List<String> outpostArns;
    /**
     * <p>
     * The Amazon EC2 instance type that you want to use for your local Amazon EKS cluster on Outposts. The instance
     * type that you specify is used for all Kubernetes control plane instances. The instance type can't be changed
     * after cluster creation.
     * </p>
     * <p>
     * Choose an instance type based on the number of nodes that your cluster will have. If your cluster will have:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1–20 nodes, then we recommend specifying a <code>large</code> instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * 21–100 nodes, then we recommend specifying an <code>xlarge</code> instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * 101–250 nodes, then we recommend specifying a <code>2xlarge</code> instance type.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of the available Amazon EC2 instance types, see Compute and storage in <a
     * href="http://aws.amazon.com/outposts/rack/features/">Outposts rack features</a>. The control plane is not
     * automatically scaled by Amazon EKS.
     * </p>
     */
    private String controlPlaneInstanceType;

    /**
     * <p>
     * The ARN of the Outpost that you want to use for your local Amazon EKS cluster on Outposts. Only a single Outpost
     * ARN is supported.
     * </p>
     * 
     * @return The ARN of the Outpost that you want to use for your local Amazon EKS cluster on Outposts. Only a single
     *         Outpost ARN is supported.
     */

    public java.util.List<String> getOutpostArns() {
        return outpostArns;
    }

    /**
     * <p>
     * The ARN of the Outpost that you want to use for your local Amazon EKS cluster on Outposts. Only a single Outpost
     * ARN is supported.
     * </p>
     * 
     * @param outpostArns
     *        The ARN of the Outpost that you want to use for your local Amazon EKS cluster on Outposts. Only a single
     *        Outpost ARN is supported.
     */

    public void setOutpostArns(java.util.Collection<String> outpostArns) {
        if (outpostArns == null) {
            this.outpostArns = null;
            return;
        }

        this.outpostArns = new java.util.ArrayList<String>(outpostArns);
    }

    /**
     * <p>
     * The ARN of the Outpost that you want to use for your local Amazon EKS cluster on Outposts. Only a single Outpost
     * ARN is supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutpostArns(java.util.Collection)} or {@link #withOutpostArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param outpostArns
     *        The ARN of the Outpost that you want to use for your local Amazon EKS cluster on Outposts. Only a single
     *        Outpost ARN is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutpostConfigRequest withOutpostArns(String... outpostArns) {
        if (this.outpostArns == null) {
            setOutpostArns(new java.util.ArrayList<String>(outpostArns.length));
        }
        for (String ele : outpostArns) {
            this.outpostArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN of the Outpost that you want to use for your local Amazon EKS cluster on Outposts. Only a single Outpost
     * ARN is supported.
     * </p>
     * 
     * @param outpostArns
     *        The ARN of the Outpost that you want to use for your local Amazon EKS cluster on Outposts. Only a single
     *        Outpost ARN is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutpostConfigRequest withOutpostArns(java.util.Collection<String> outpostArns) {
        setOutpostArns(outpostArns);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance type that you want to use for your local Amazon EKS cluster on Outposts. The instance
     * type that you specify is used for all Kubernetes control plane instances. The instance type can't be changed
     * after cluster creation.
     * </p>
     * <p>
     * Choose an instance type based on the number of nodes that your cluster will have. If your cluster will have:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1–20 nodes, then we recommend specifying a <code>large</code> instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * 21–100 nodes, then we recommend specifying an <code>xlarge</code> instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * 101–250 nodes, then we recommend specifying a <code>2xlarge</code> instance type.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of the available Amazon EC2 instance types, see Compute and storage in <a
     * href="http://aws.amazon.com/outposts/rack/features/">Outposts rack features</a>. The control plane is not
     * automatically scaled by Amazon EKS.
     * </p>
     * 
     * @param controlPlaneInstanceType
     *        The Amazon EC2 instance type that you want to use for your local Amazon EKS cluster on Outposts. The
     *        instance type that you specify is used for all Kubernetes control plane instances. The instance type can't
     *        be changed after cluster creation.</p>
     *        <p>
     *        Choose an instance type based on the number of nodes that your cluster will have. If your cluster will
     *        have:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        1–20 nodes, then we recommend specifying a <code>large</code> instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        21–100 nodes, then we recommend specifying an <code>xlarge</code> instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        101–250 nodes, then we recommend specifying a <code>2xlarge</code> instance type.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a list of the available Amazon EC2 instance types, see Compute and storage in <a
     *        href="http://aws.amazon.com/outposts/rack/features/">Outposts rack features</a>. The control plane is not
     *        automatically scaled by Amazon EKS.
     */

    public void setControlPlaneInstanceType(String controlPlaneInstanceType) {
        this.controlPlaneInstanceType = controlPlaneInstanceType;
    }

    /**
     * <p>
     * The Amazon EC2 instance type that you want to use for your local Amazon EKS cluster on Outposts. The instance
     * type that you specify is used for all Kubernetes control plane instances. The instance type can't be changed
     * after cluster creation.
     * </p>
     * <p>
     * Choose an instance type based on the number of nodes that your cluster will have. If your cluster will have:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1–20 nodes, then we recommend specifying a <code>large</code> instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * 21–100 nodes, then we recommend specifying an <code>xlarge</code> instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * 101–250 nodes, then we recommend specifying a <code>2xlarge</code> instance type.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of the available Amazon EC2 instance types, see Compute and storage in <a
     * href="http://aws.amazon.com/outposts/rack/features/">Outposts rack features</a>. The control plane is not
     * automatically scaled by Amazon EKS.
     * </p>
     * 
     * @return The Amazon EC2 instance type that you want to use for your local Amazon EKS cluster on Outposts. The
     *         instance type that you specify is used for all Kubernetes control plane instances. The instance type
     *         can't be changed after cluster creation.</p>
     *         <p>
     *         Choose an instance type based on the number of nodes that your cluster will have. If your cluster will
     *         have:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         1–20 nodes, then we recommend specifying a <code>large</code> instance type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         21–100 nodes, then we recommend specifying an <code>xlarge</code> instance type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         101–250 nodes, then we recommend specifying a <code>2xlarge</code> instance type.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a list of the available Amazon EC2 instance types, see Compute and storage in <a
     *         href="http://aws.amazon.com/outposts/rack/features/">Outposts rack features</a>. The control plane is not
     *         automatically scaled by Amazon EKS.
     */

    public String getControlPlaneInstanceType() {
        return this.controlPlaneInstanceType;
    }

    /**
     * <p>
     * The Amazon EC2 instance type that you want to use for your local Amazon EKS cluster on Outposts. The instance
     * type that you specify is used for all Kubernetes control plane instances. The instance type can't be changed
     * after cluster creation.
     * </p>
     * <p>
     * Choose an instance type based on the number of nodes that your cluster will have. If your cluster will have:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1–20 nodes, then we recommend specifying a <code>large</code> instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * 21–100 nodes, then we recommend specifying an <code>xlarge</code> instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * 101–250 nodes, then we recommend specifying a <code>2xlarge</code> instance type.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of the available Amazon EC2 instance types, see Compute and storage in <a
     * href="http://aws.amazon.com/outposts/rack/features/">Outposts rack features</a>. The control plane is not
     * automatically scaled by Amazon EKS.
     * </p>
     * 
     * @param controlPlaneInstanceType
     *        The Amazon EC2 instance type that you want to use for your local Amazon EKS cluster on Outposts. The
     *        instance type that you specify is used for all Kubernetes control plane instances. The instance type can't
     *        be changed after cluster creation.</p>
     *        <p>
     *        Choose an instance type based on the number of nodes that your cluster will have. If your cluster will
     *        have:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        1–20 nodes, then we recommend specifying a <code>large</code> instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        21–100 nodes, then we recommend specifying an <code>xlarge</code> instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        101–250 nodes, then we recommend specifying a <code>2xlarge</code> instance type.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a list of the available Amazon EC2 instance types, see Compute and storage in <a
     *        href="http://aws.amazon.com/outposts/rack/features/">Outposts rack features</a>. The control plane is not
     *        automatically scaled by Amazon EKS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutpostConfigRequest withControlPlaneInstanceType(String controlPlaneInstanceType) {
        setControlPlaneInstanceType(controlPlaneInstanceType);
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
        if (getOutpostArns() != null)
            sb.append("OutpostArns: ").append(getOutpostArns()).append(",");
        if (getControlPlaneInstanceType() != null)
            sb.append("ControlPlaneInstanceType: ").append(getControlPlaneInstanceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutpostConfigRequest == false)
            return false;
        OutpostConfigRequest other = (OutpostConfigRequest) obj;
        if (other.getOutpostArns() == null ^ this.getOutpostArns() == null)
            return false;
        if (other.getOutpostArns() != null && other.getOutpostArns().equals(this.getOutpostArns()) == false)
            return false;
        if (other.getControlPlaneInstanceType() == null ^ this.getControlPlaneInstanceType() == null)
            return false;
        if (other.getControlPlaneInstanceType() != null && other.getControlPlaneInstanceType().equals(this.getControlPlaneInstanceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutpostArns() == null) ? 0 : getOutpostArns().hashCode());
        hashCode = prime * hashCode + ((getControlPlaneInstanceType() == null) ? 0 : getControlPlaneInstanceType().hashCode());
        return hashCode;
    }

    @Override
    public OutpostConfigRequest clone() {
        try {
            return (OutpostConfigRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.OutpostConfigRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
