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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AssociateDataShareConsumer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateDataShareConsumerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the datashare that the consumer is to use.
     * </p>
     */
    private String dataShareArn;
    /**
     * <p>
     * A value that specifies whether the datashare is associated with the entire account.
     * </p>
     */
    private Boolean associateEntireAccount;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the consumer namespace associated with the datashare.
     * </p>
     */
    private String consumerArn;
    /**
     * <p>
     * From a datashare consumer account, associates a datashare with all existing and future namespaces in the
     * specified Amazon Web Services Region.
     * </p>
     */
    private String consumerRegion;
    /**
     * <p>
     * If set to true, allows write operations for a datashare.
     * </p>
     */
    private Boolean allowWrites;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the datashare that the consumer is to use.
     * </p>
     * 
     * @param dataShareArn
     *        The Amazon Resource Name (ARN) of the datashare that the consumer is to use.
     */

    public void setDataShareArn(String dataShareArn) {
        this.dataShareArn = dataShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the datashare that the consumer is to use.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the datashare that the consumer is to use.
     */

    public String getDataShareArn() {
        return this.dataShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the datashare that the consumer is to use.
     * </p>
     * 
     * @param dataShareArn
     *        The Amazon Resource Name (ARN) of the datashare that the consumer is to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDataShareConsumerRequest withDataShareArn(String dataShareArn) {
        setDataShareArn(dataShareArn);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether the datashare is associated with the entire account.
     * </p>
     * 
     * @param associateEntireAccount
     *        A value that specifies whether the datashare is associated with the entire account.
     */

    public void setAssociateEntireAccount(Boolean associateEntireAccount) {
        this.associateEntireAccount = associateEntireAccount;
    }

    /**
     * <p>
     * A value that specifies whether the datashare is associated with the entire account.
     * </p>
     * 
     * @return A value that specifies whether the datashare is associated with the entire account.
     */

    public Boolean getAssociateEntireAccount() {
        return this.associateEntireAccount;
    }

    /**
     * <p>
     * A value that specifies whether the datashare is associated with the entire account.
     * </p>
     * 
     * @param associateEntireAccount
     *        A value that specifies whether the datashare is associated with the entire account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDataShareConsumerRequest withAssociateEntireAccount(Boolean associateEntireAccount) {
        setAssociateEntireAccount(associateEntireAccount);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether the datashare is associated with the entire account.
     * </p>
     * 
     * @return A value that specifies whether the datashare is associated with the entire account.
     */

    public Boolean isAssociateEntireAccount() {
        return this.associateEntireAccount;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the consumer namespace associated with the datashare.
     * </p>
     * 
     * @param consumerArn
     *        The Amazon Resource Name (ARN) of the consumer namespace associated with the datashare.
     */

    public void setConsumerArn(String consumerArn) {
        this.consumerArn = consumerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the consumer namespace associated with the datashare.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the consumer namespace associated with the datashare.
     */

    public String getConsumerArn() {
        return this.consumerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the consumer namespace associated with the datashare.
     * </p>
     * 
     * @param consumerArn
     *        The Amazon Resource Name (ARN) of the consumer namespace associated with the datashare.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDataShareConsumerRequest withConsumerArn(String consumerArn) {
        setConsumerArn(consumerArn);
        return this;
    }

    /**
     * <p>
     * From a datashare consumer account, associates a datashare with all existing and future namespaces in the
     * specified Amazon Web Services Region.
     * </p>
     * 
     * @param consumerRegion
     *        From a datashare consumer account, associates a datashare with all existing and future namespaces in the
     *        specified Amazon Web Services Region.
     */

    public void setConsumerRegion(String consumerRegion) {
        this.consumerRegion = consumerRegion;
    }

    /**
     * <p>
     * From a datashare consumer account, associates a datashare with all existing and future namespaces in the
     * specified Amazon Web Services Region.
     * </p>
     * 
     * @return From a datashare consumer account, associates a datashare with all existing and future namespaces in the
     *         specified Amazon Web Services Region.
     */

    public String getConsumerRegion() {
        return this.consumerRegion;
    }

    /**
     * <p>
     * From a datashare consumer account, associates a datashare with all existing and future namespaces in the
     * specified Amazon Web Services Region.
     * </p>
     * 
     * @param consumerRegion
     *        From a datashare consumer account, associates a datashare with all existing and future namespaces in the
     *        specified Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDataShareConsumerRequest withConsumerRegion(String consumerRegion) {
        setConsumerRegion(consumerRegion);
        return this;
    }

    /**
     * <p>
     * If set to true, allows write operations for a datashare.
     * </p>
     * 
     * @param allowWrites
     *        If set to true, allows write operations for a datashare.
     */

    public void setAllowWrites(Boolean allowWrites) {
        this.allowWrites = allowWrites;
    }

    /**
     * <p>
     * If set to true, allows write operations for a datashare.
     * </p>
     * 
     * @return If set to true, allows write operations for a datashare.
     */

    public Boolean getAllowWrites() {
        return this.allowWrites;
    }

    /**
     * <p>
     * If set to true, allows write operations for a datashare.
     * </p>
     * 
     * @param allowWrites
     *        If set to true, allows write operations for a datashare.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDataShareConsumerRequest withAllowWrites(Boolean allowWrites) {
        setAllowWrites(allowWrites);
        return this;
    }

    /**
     * <p>
     * If set to true, allows write operations for a datashare.
     * </p>
     * 
     * @return If set to true, allows write operations for a datashare.
     */

    public Boolean isAllowWrites() {
        return this.allowWrites;
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
        if (getDataShareArn() != null)
            sb.append("DataShareArn: ").append(getDataShareArn()).append(",");
        if (getAssociateEntireAccount() != null)
            sb.append("AssociateEntireAccount: ").append(getAssociateEntireAccount()).append(",");
        if (getConsumerArn() != null)
            sb.append("ConsumerArn: ").append(getConsumerArn()).append(",");
        if (getConsumerRegion() != null)
            sb.append("ConsumerRegion: ").append(getConsumerRegion()).append(",");
        if (getAllowWrites() != null)
            sb.append("AllowWrites: ").append(getAllowWrites());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateDataShareConsumerRequest == false)
            return false;
        AssociateDataShareConsumerRequest other = (AssociateDataShareConsumerRequest) obj;
        if (other.getDataShareArn() == null ^ this.getDataShareArn() == null)
            return false;
        if (other.getDataShareArn() != null && other.getDataShareArn().equals(this.getDataShareArn()) == false)
            return false;
        if (other.getAssociateEntireAccount() == null ^ this.getAssociateEntireAccount() == null)
            return false;
        if (other.getAssociateEntireAccount() != null && other.getAssociateEntireAccount().equals(this.getAssociateEntireAccount()) == false)
            return false;
        if (other.getConsumerArn() == null ^ this.getConsumerArn() == null)
            return false;
        if (other.getConsumerArn() != null && other.getConsumerArn().equals(this.getConsumerArn()) == false)
            return false;
        if (other.getConsumerRegion() == null ^ this.getConsumerRegion() == null)
            return false;
        if (other.getConsumerRegion() != null && other.getConsumerRegion().equals(this.getConsumerRegion()) == false)
            return false;
        if (other.getAllowWrites() == null ^ this.getAllowWrites() == null)
            return false;
        if (other.getAllowWrites() != null && other.getAllowWrites().equals(this.getAllowWrites()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataShareArn() == null) ? 0 : getDataShareArn().hashCode());
        hashCode = prime * hashCode + ((getAssociateEntireAccount() == null) ? 0 : getAssociateEntireAccount().hashCode());
        hashCode = prime * hashCode + ((getConsumerArn() == null) ? 0 : getConsumerArn().hashCode());
        hashCode = prime * hashCode + ((getConsumerRegion() == null) ? 0 : getConsumerRegion().hashCode());
        hashCode = prime * hashCode + ((getAllowWrites() == null) ? 0 : getAllowWrites().hashCode());
        return hashCode;
    }

    @Override
    public AssociateDataShareConsumerRequest clone() {
        return (AssociateDataShareConsumerRequest) super.clone();
    }

}
