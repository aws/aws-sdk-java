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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DisassociateDataShareConsumer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateDataShareConsumerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the datashare to remove association for.
     * </p>
     */
    private String dataShareArn;
    /**
     * <p>
     * A value that specifies whether association for the datashare is removed from the entire account.
     * </p>
     */
    private Boolean disassociateEntireAccount;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the consumer that association for the datashare is removed from.
     * </p>
     */
    private String consumerArn;
    /**
     * <p>
     * From a datashare consumer account, removes association of a datashare from all the existing and future namespaces
     * in the specified Amazon Web Services Region.
     * </p>
     */
    private String consumerRegion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the datashare to remove association for.
     * </p>
     * 
     * @param dataShareArn
     *        The Amazon Resource Name (ARN) of the datashare to remove association for.
     */

    public void setDataShareArn(String dataShareArn) {
        this.dataShareArn = dataShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the datashare to remove association for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the datashare to remove association for.
     */

    public String getDataShareArn() {
        return this.dataShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the datashare to remove association for.
     * </p>
     * 
     * @param dataShareArn
     *        The Amazon Resource Name (ARN) of the datashare to remove association for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateDataShareConsumerRequest withDataShareArn(String dataShareArn) {
        setDataShareArn(dataShareArn);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether association for the datashare is removed from the entire account.
     * </p>
     * 
     * @param disassociateEntireAccount
     *        A value that specifies whether association for the datashare is removed from the entire account.
     */

    public void setDisassociateEntireAccount(Boolean disassociateEntireAccount) {
        this.disassociateEntireAccount = disassociateEntireAccount;
    }

    /**
     * <p>
     * A value that specifies whether association for the datashare is removed from the entire account.
     * </p>
     * 
     * @return A value that specifies whether association for the datashare is removed from the entire account.
     */

    public Boolean getDisassociateEntireAccount() {
        return this.disassociateEntireAccount;
    }

    /**
     * <p>
     * A value that specifies whether association for the datashare is removed from the entire account.
     * </p>
     * 
     * @param disassociateEntireAccount
     *        A value that specifies whether association for the datashare is removed from the entire account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateDataShareConsumerRequest withDisassociateEntireAccount(Boolean disassociateEntireAccount) {
        setDisassociateEntireAccount(disassociateEntireAccount);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether association for the datashare is removed from the entire account.
     * </p>
     * 
     * @return A value that specifies whether association for the datashare is removed from the entire account.
     */

    public Boolean isDisassociateEntireAccount() {
        return this.disassociateEntireAccount;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the consumer that association for the datashare is removed from.
     * </p>
     * 
     * @param consumerArn
     *        The Amazon Resource Name (ARN) of the consumer that association for the datashare is removed from.
     */

    public void setConsumerArn(String consumerArn) {
        this.consumerArn = consumerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the consumer that association for the datashare is removed from.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the consumer that association for the datashare is removed from.
     */

    public String getConsumerArn() {
        return this.consumerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the consumer that association for the datashare is removed from.
     * </p>
     * 
     * @param consumerArn
     *        The Amazon Resource Name (ARN) of the consumer that association for the datashare is removed from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateDataShareConsumerRequest withConsumerArn(String consumerArn) {
        setConsumerArn(consumerArn);
        return this;
    }

    /**
     * <p>
     * From a datashare consumer account, removes association of a datashare from all the existing and future namespaces
     * in the specified Amazon Web Services Region.
     * </p>
     * 
     * @param consumerRegion
     *        From a datashare consumer account, removes association of a datashare from all the existing and future
     *        namespaces in the specified Amazon Web Services Region.
     */

    public void setConsumerRegion(String consumerRegion) {
        this.consumerRegion = consumerRegion;
    }

    /**
     * <p>
     * From a datashare consumer account, removes association of a datashare from all the existing and future namespaces
     * in the specified Amazon Web Services Region.
     * </p>
     * 
     * @return From a datashare consumer account, removes association of a datashare from all the existing and future
     *         namespaces in the specified Amazon Web Services Region.
     */

    public String getConsumerRegion() {
        return this.consumerRegion;
    }

    /**
     * <p>
     * From a datashare consumer account, removes association of a datashare from all the existing and future namespaces
     * in the specified Amazon Web Services Region.
     * </p>
     * 
     * @param consumerRegion
     *        From a datashare consumer account, removes association of a datashare from all the existing and future
     *        namespaces in the specified Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateDataShareConsumerRequest withConsumerRegion(String consumerRegion) {
        setConsumerRegion(consumerRegion);
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
        if (getDataShareArn() != null)
            sb.append("DataShareArn: ").append(getDataShareArn()).append(",");
        if (getDisassociateEntireAccount() != null)
            sb.append("DisassociateEntireAccount: ").append(getDisassociateEntireAccount()).append(",");
        if (getConsumerArn() != null)
            sb.append("ConsumerArn: ").append(getConsumerArn()).append(",");
        if (getConsumerRegion() != null)
            sb.append("ConsumerRegion: ").append(getConsumerRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateDataShareConsumerRequest == false)
            return false;
        DisassociateDataShareConsumerRequest other = (DisassociateDataShareConsumerRequest) obj;
        if (other.getDataShareArn() == null ^ this.getDataShareArn() == null)
            return false;
        if (other.getDataShareArn() != null && other.getDataShareArn().equals(this.getDataShareArn()) == false)
            return false;
        if (other.getDisassociateEntireAccount() == null ^ this.getDisassociateEntireAccount() == null)
            return false;
        if (other.getDisassociateEntireAccount() != null && other.getDisassociateEntireAccount().equals(this.getDisassociateEntireAccount()) == false)
            return false;
        if (other.getConsumerArn() == null ^ this.getConsumerArn() == null)
            return false;
        if (other.getConsumerArn() != null && other.getConsumerArn().equals(this.getConsumerArn()) == false)
            return false;
        if (other.getConsumerRegion() == null ^ this.getConsumerRegion() == null)
            return false;
        if (other.getConsumerRegion() != null && other.getConsumerRegion().equals(this.getConsumerRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataShareArn() == null) ? 0 : getDataShareArn().hashCode());
        hashCode = prime * hashCode + ((getDisassociateEntireAccount() == null) ? 0 : getDisassociateEntireAccount().hashCode());
        hashCode = prime * hashCode + ((getConsumerArn() == null) ? 0 : getConsumerArn().hashCode());
        hashCode = prime * hashCode + ((getConsumerRegion() == null) ? 0 : getConsumerRegion().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateDataShareConsumerRequest clone() {
        return (DisassociateDataShareConsumerRequest) super.clone();
    }

}
