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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The input source of the Amazon Elastic Kubernetes Service cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/EksSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Amazon Elastic Kubernetes Service cluster. The format for this ARN is: arn:
     * <code>aws</code>:eks:<code>region</code>:<code>account-id</code>:cluster/<code>cluster-name</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     */
    private String eksClusterArn;
    /**
     * <p>
     * The list of namespaces located on your Amazon Elastic Kubernetes Service cluster.
     * </p>
     */
    private java.util.List<String> namespaces;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Amazon Elastic Kubernetes Service cluster. The format for this ARN is: arn:
     * <code>aws</code>:eks:<code>region</code>:<code>account-id</code>:cluster/<code>cluster-name</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param eksClusterArn
     *        Amazon Resource Name (ARN) of the Amazon Elastic Kubernetes Service cluster. The format for this ARN is:
     *        arn:<code>aws</code>:eks:<code>region</code>:<code>account-id</code>:cluster/<code>cluster-name</code>.
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public void setEksClusterArn(String eksClusterArn) {
        this.eksClusterArn = eksClusterArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Amazon Elastic Kubernetes Service cluster. The format for this ARN is: arn:
     * <code>aws</code>:eks:<code>region</code>:<code>account-id</code>:cluster/<code>cluster-name</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the Amazon Elastic Kubernetes Service cluster. The format for this ARN is:
     *         arn:<code>aws</code>:eks:<code>region</code>:<code>account-id</code>:cluster/<code>cluster-name</code>.
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public String getEksClusterArn() {
        return this.eksClusterArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Amazon Elastic Kubernetes Service cluster. The format for this ARN is: arn:
     * <code>aws</code>:eks:<code>region</code>:<code>account-id</code>:cluster/<code>cluster-name</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param eksClusterArn
     *        Amazon Resource Name (ARN) of the Amazon Elastic Kubernetes Service cluster. The format for this ARN is:
     *        arn:<code>aws</code>:eks:<code>region</code>:<code>account-id</code>:cluster/<code>cluster-name</code>.
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksSource withEksClusterArn(String eksClusterArn) {
        setEksClusterArn(eksClusterArn);
        return this;
    }

    /**
     * <p>
     * The list of namespaces located on your Amazon Elastic Kubernetes Service cluster.
     * </p>
     * 
     * @return The list of namespaces located on your Amazon Elastic Kubernetes Service cluster.
     */

    public java.util.List<String> getNamespaces() {
        return namespaces;
    }

    /**
     * <p>
     * The list of namespaces located on your Amazon Elastic Kubernetes Service cluster.
     * </p>
     * 
     * @param namespaces
     *        The list of namespaces located on your Amazon Elastic Kubernetes Service cluster.
     */

    public void setNamespaces(java.util.Collection<String> namespaces) {
        if (namespaces == null) {
            this.namespaces = null;
            return;
        }

        this.namespaces = new java.util.ArrayList<String>(namespaces);
    }

    /**
     * <p>
     * The list of namespaces located on your Amazon Elastic Kubernetes Service cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNamespaces(java.util.Collection)} or {@link #withNamespaces(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param namespaces
     *        The list of namespaces located on your Amazon Elastic Kubernetes Service cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksSource withNamespaces(String... namespaces) {
        if (this.namespaces == null) {
            setNamespaces(new java.util.ArrayList<String>(namespaces.length));
        }
        for (String ele : namespaces) {
            this.namespaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of namespaces located on your Amazon Elastic Kubernetes Service cluster.
     * </p>
     * 
     * @param namespaces
     *        The list of namespaces located on your Amazon Elastic Kubernetes Service cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksSource withNamespaces(java.util.Collection<String> namespaces) {
        setNamespaces(namespaces);
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
        if (getEksClusterArn() != null)
            sb.append("EksClusterArn: ").append(getEksClusterArn()).append(",");
        if (getNamespaces() != null)
            sb.append("Namespaces: ").append(getNamespaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksSource == false)
            return false;
        EksSource other = (EksSource) obj;
        if (other.getEksClusterArn() == null ^ this.getEksClusterArn() == null)
            return false;
        if (other.getEksClusterArn() != null && other.getEksClusterArn().equals(this.getEksClusterArn()) == false)
            return false;
        if (other.getNamespaces() == null ^ this.getNamespaces() == null)
            return false;
        if (other.getNamespaces() != null && other.getNamespaces().equals(this.getNamespaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEksClusterArn() == null) ? 0 : getEksClusterArn().hashCode());
        hashCode = prime * hashCode + ((getNamespaces() == null) ? 0 : getNamespaces().hashCode());
        return hashCode;
    }

    @Override
    public EksSource clone() {
        try {
            return (EksSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.EksSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
