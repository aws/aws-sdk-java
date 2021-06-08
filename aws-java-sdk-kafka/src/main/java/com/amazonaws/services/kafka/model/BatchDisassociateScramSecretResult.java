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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/BatchDisassociateScramSecret" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDisassociateScramSecretResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * List of errors when disassociating secrets to cluster.
     * </p>
     */
    private java.util.List<UnprocessedScramSecret> unprocessedScramSecrets;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) of the cluster.
     *        </p>
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the cluster.
     *         </p>
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) of the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateScramSecretResult withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * List of errors when disassociating secrets to cluster.
     * </p>
     * 
     * @return <p>
     *         List of errors when disassociating secrets to cluster.
     *         </p>
     */

    public java.util.List<UnprocessedScramSecret> getUnprocessedScramSecrets() {
        return unprocessedScramSecrets;
    }

    /**
     * <p>
     * List of errors when disassociating secrets to cluster.
     * </p>
     * 
     * @param unprocessedScramSecrets
     *        <p>
     *        List of errors when disassociating secrets to cluster.
     *        </p>
     */

    public void setUnprocessedScramSecrets(java.util.Collection<UnprocessedScramSecret> unprocessedScramSecrets) {
        if (unprocessedScramSecrets == null) {
            this.unprocessedScramSecrets = null;
            return;
        }

        this.unprocessedScramSecrets = new java.util.ArrayList<UnprocessedScramSecret>(unprocessedScramSecrets);
    }

    /**
     * <p>
     * List of errors when disassociating secrets to cluster.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedScramSecrets(java.util.Collection)} or
     * {@link #withUnprocessedScramSecrets(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedScramSecrets
     *        <p>
     *        List of errors when disassociating secrets to cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateScramSecretResult withUnprocessedScramSecrets(UnprocessedScramSecret... unprocessedScramSecrets) {
        if (this.unprocessedScramSecrets == null) {
            setUnprocessedScramSecrets(new java.util.ArrayList<UnprocessedScramSecret>(unprocessedScramSecrets.length));
        }
        for (UnprocessedScramSecret ele : unprocessedScramSecrets) {
            this.unprocessedScramSecrets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of errors when disassociating secrets to cluster.
     * </p>
     * 
     * @param unprocessedScramSecrets
     *        <p>
     *        List of errors when disassociating secrets to cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateScramSecretResult withUnprocessedScramSecrets(java.util.Collection<UnprocessedScramSecret> unprocessedScramSecrets) {
        setUnprocessedScramSecrets(unprocessedScramSecrets);
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getUnprocessedScramSecrets() != null)
            sb.append("UnprocessedScramSecrets: ").append(getUnprocessedScramSecrets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDisassociateScramSecretResult == false)
            return false;
        BatchDisassociateScramSecretResult other = (BatchDisassociateScramSecretResult) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getUnprocessedScramSecrets() == null ^ this.getUnprocessedScramSecrets() == null)
            return false;
        if (other.getUnprocessedScramSecrets() != null && other.getUnprocessedScramSecrets().equals(this.getUnprocessedScramSecrets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedScramSecrets() == null) ? 0 : getUnprocessedScramSecrets().hashCode());
        return hashCode;
    }

    @Override
    public BatchDisassociateScramSecretResult clone() {
        try {
            return (BatchDisassociateScramSecretResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
