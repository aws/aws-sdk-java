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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <a>TestGridSession</a> is a single instance of a browser launched from the URL provided by a call to
 * <a>CreateTestGridUrl</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/TestGridSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestGridSession implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the session.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The state of the session.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time that the session was started.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The time the session ended.
     * </p>
     */
    private java.util.Date ended;
    /**
     * <p>
     * The number of billed minutes that were used for this session.
     * </p>
     */
    private Double billingMinutes;
    /**
     * <p>
     * A JSON object of options and parameters passed to the Selenium WebDriver.
     * </p>
     */
    private String seleniumProperties;

    /**
     * <p>
     * The ARN of the session.
     * </p>
     * 
     * @param arn
     *        The ARN of the session.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the session.
     * </p>
     * 
     * @return The ARN of the session.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the session.
     * </p>
     * 
     * @param arn
     *        The ARN of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestGridSession withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The state of the session.
     * </p>
     * 
     * @param status
     *        The state of the session.
     * @see TestGridSessionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of the session.
     * </p>
     * 
     * @return The state of the session.
     * @see TestGridSessionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state of the session.
     * </p>
     * 
     * @param status
     *        The state of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestGridSessionStatus
     */

    public TestGridSession withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of the session.
     * </p>
     * 
     * @param status
     *        The state of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestGridSessionStatus
     */

    public TestGridSession withStatus(TestGridSessionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time that the session was started.
     * </p>
     * 
     * @param created
     *        The time that the session was started.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The time that the session was started.
     * </p>
     * 
     * @return The time that the session was started.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The time that the session was started.
     * </p>
     * 
     * @param created
     *        The time that the session was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestGridSession withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The time the session ended.
     * </p>
     * 
     * @param ended
     *        The time the session ended.
     */

    public void setEnded(java.util.Date ended) {
        this.ended = ended;
    }

    /**
     * <p>
     * The time the session ended.
     * </p>
     * 
     * @return The time the session ended.
     */

    public java.util.Date getEnded() {
        return this.ended;
    }

    /**
     * <p>
     * The time the session ended.
     * </p>
     * 
     * @param ended
     *        The time the session ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestGridSession withEnded(java.util.Date ended) {
        setEnded(ended);
        return this;
    }

    /**
     * <p>
     * The number of billed minutes that were used for this session.
     * </p>
     * 
     * @param billingMinutes
     *        The number of billed minutes that were used for this session.
     */

    public void setBillingMinutes(Double billingMinutes) {
        this.billingMinutes = billingMinutes;
    }

    /**
     * <p>
     * The number of billed minutes that were used for this session.
     * </p>
     * 
     * @return The number of billed minutes that were used for this session.
     */

    public Double getBillingMinutes() {
        return this.billingMinutes;
    }

    /**
     * <p>
     * The number of billed minutes that were used for this session.
     * </p>
     * 
     * @param billingMinutes
     *        The number of billed minutes that were used for this session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestGridSession withBillingMinutes(Double billingMinutes) {
        setBillingMinutes(billingMinutes);
        return this;
    }

    /**
     * <p>
     * A JSON object of options and parameters passed to the Selenium WebDriver.
     * </p>
     * 
     * @param seleniumProperties
     *        A JSON object of options and parameters passed to the Selenium WebDriver.
     */

    public void setSeleniumProperties(String seleniumProperties) {
        this.seleniumProperties = seleniumProperties;
    }

    /**
     * <p>
     * A JSON object of options and parameters passed to the Selenium WebDriver.
     * </p>
     * 
     * @return A JSON object of options and parameters passed to the Selenium WebDriver.
     */

    public String getSeleniumProperties() {
        return this.seleniumProperties;
    }

    /**
     * <p>
     * A JSON object of options and parameters passed to the Selenium WebDriver.
     * </p>
     * 
     * @param seleniumProperties
     *        A JSON object of options and parameters passed to the Selenium WebDriver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestGridSession withSeleniumProperties(String seleniumProperties) {
        setSeleniumProperties(seleniumProperties);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getEnded() != null)
            sb.append("Ended: ").append(getEnded()).append(",");
        if (getBillingMinutes() != null)
            sb.append("BillingMinutes: ").append(getBillingMinutes()).append(",");
        if (getSeleniumProperties() != null)
            sb.append("SeleniumProperties: ").append(getSeleniumProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestGridSession == false)
            return false;
        TestGridSession other = (TestGridSession) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getEnded() == null ^ this.getEnded() == null)
            return false;
        if (other.getEnded() != null && other.getEnded().equals(this.getEnded()) == false)
            return false;
        if (other.getBillingMinutes() == null ^ this.getBillingMinutes() == null)
            return false;
        if (other.getBillingMinutes() != null && other.getBillingMinutes().equals(this.getBillingMinutes()) == false)
            return false;
        if (other.getSeleniumProperties() == null ^ this.getSeleniumProperties() == null)
            return false;
        if (other.getSeleniumProperties() != null && other.getSeleniumProperties().equals(this.getSeleniumProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getEnded() == null) ? 0 : getEnded().hashCode());
        hashCode = prime * hashCode + ((getBillingMinutes() == null) ? 0 : getBillingMinutes().hashCode());
        hashCode = prime * hashCode + ((getSeleniumProperties() == null) ? 0 : getSeleniumProperties().hashCode());
        return hashCode;
    }

    @Override
    public TestGridSession clone() {
        try {
            return (TestGridSession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.TestGridSessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
