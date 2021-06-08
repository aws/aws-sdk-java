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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 <p>
 * Associates sasl scram secrets to cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/BatchAssociateScramSecret" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchAssociateScramSecretRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster to be updated.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * List of AWS Secrets Manager secret ARNs.
     * </p>
     */
    private java.util.List<String> secretArnList;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster to be updated.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) of the cluster to be updated.
     *        </p>
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster to be updated.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the cluster to be updated.
     *         </p>
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster to be updated.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) of the cluster to be updated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateScramSecretRequest withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * List of AWS Secrets Manager secret ARNs.
     * </p>
     * 
     * @return <p>
     *         List of AWS Secrets Manager secret ARNs.
     *         </p>
     */

    public java.util.List<String> getSecretArnList() {
        return secretArnList;
    }

    /**
     * <p>
     * List of AWS Secrets Manager secret ARNs.
     * </p>
     * 
     * @param secretArnList
     *        <p>
     *        List of AWS Secrets Manager secret ARNs.
     *        </p>
     */

    public void setSecretArnList(java.util.Collection<String> secretArnList) {
        if (secretArnList == null) {
            this.secretArnList = null;
            return;
        }

        this.secretArnList = new java.util.ArrayList<String>(secretArnList);
    }

    /**
     * <p>
     * List of AWS Secrets Manager secret ARNs.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecretArnList(java.util.Collection)} or {@link #withSecretArnList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param secretArnList
     *        <p>
     *        List of AWS Secrets Manager secret ARNs.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateScramSecretRequest withSecretArnList(String... secretArnList) {
        if (this.secretArnList == null) {
            setSecretArnList(new java.util.ArrayList<String>(secretArnList.length));
        }
        for (String ele : secretArnList) {
            this.secretArnList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of AWS Secrets Manager secret ARNs.
     * </p>
     * 
     * @param secretArnList
     *        <p>
     *        List of AWS Secrets Manager secret ARNs.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateScramSecretRequest withSecretArnList(java.util.Collection<String> secretArnList) {
        setSecretArnList(secretArnList);
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
        if (getSecretArnList() != null)
            sb.append("SecretArnList: ").append(getSecretArnList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchAssociateScramSecretRequest == false)
            return false;
        BatchAssociateScramSecretRequest other = (BatchAssociateScramSecretRequest) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getSecretArnList() == null ^ this.getSecretArnList() == null)
            return false;
        if (other.getSecretArnList() != null && other.getSecretArnList().equals(this.getSecretArnList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getSecretArnList() == null) ? 0 : getSecretArnList().hashCode());
        return hashCode;
    }

    @Override
    public BatchAssociateScramSecretRequest clone() {
        return (BatchAssociateScramSecretRequest) super.clone();
    }

}
