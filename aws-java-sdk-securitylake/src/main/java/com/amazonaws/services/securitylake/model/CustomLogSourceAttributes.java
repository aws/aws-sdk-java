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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The attributes of a third-party custom source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CustomLogSourceAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomLogSourceAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Glue crawler.
     * </p>
     */
    private String crawlerArn;
    /**
     * <p>
     * The ARN of the Glue database where results are written, such as:
     * <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * </p>
     */
    private String databaseArn;
    /**
     * <p>
     * The ARN of the Glue table.
     * </p>
     */
    private String tableArn;

    /**
     * <p>
     * The ARN of the Glue crawler.
     * </p>
     * 
     * @param crawlerArn
     *        The ARN of the Glue crawler.
     */

    public void setCrawlerArn(String crawlerArn) {
        this.crawlerArn = crawlerArn;
    }

    /**
     * <p>
     * The ARN of the Glue crawler.
     * </p>
     * 
     * @return The ARN of the Glue crawler.
     */

    public String getCrawlerArn() {
        return this.crawlerArn;
    }

    /**
     * <p>
     * The ARN of the Glue crawler.
     * </p>
     * 
     * @param crawlerArn
     *        The ARN of the Glue crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLogSourceAttributes withCrawlerArn(String crawlerArn) {
        setCrawlerArn(crawlerArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the Glue database where results are written, such as:
     * <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * </p>
     * 
     * @param databaseArn
     *        The ARN of the Glue database where results are written, such as:
     *        <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     */

    public void setDatabaseArn(String databaseArn) {
        this.databaseArn = databaseArn;
    }

    /**
     * <p>
     * The ARN of the Glue database where results are written, such as:
     * <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * </p>
     * 
     * @return The ARN of the Glue database where results are written, such as:
     *         <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     */

    public String getDatabaseArn() {
        return this.databaseArn;
    }

    /**
     * <p>
     * The ARN of the Glue database where results are written, such as:
     * <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * </p>
     * 
     * @param databaseArn
     *        The ARN of the Glue database where results are written, such as:
     *        <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLogSourceAttributes withDatabaseArn(String databaseArn) {
        setDatabaseArn(databaseArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the Glue table.
     * </p>
     * 
     * @param tableArn
     *        The ARN of the Glue table.
     */

    public void setTableArn(String tableArn) {
        this.tableArn = tableArn;
    }

    /**
     * <p>
     * The ARN of the Glue table.
     * </p>
     * 
     * @return The ARN of the Glue table.
     */

    public String getTableArn() {
        return this.tableArn;
    }

    /**
     * <p>
     * The ARN of the Glue table.
     * </p>
     * 
     * @param tableArn
     *        The ARN of the Glue table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLogSourceAttributes withTableArn(String tableArn) {
        setTableArn(tableArn);
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
        if (getCrawlerArn() != null)
            sb.append("CrawlerArn: ").append(getCrawlerArn()).append(",");
        if (getDatabaseArn() != null)
            sb.append("DatabaseArn: ").append(getDatabaseArn()).append(",");
        if (getTableArn() != null)
            sb.append("TableArn: ").append(getTableArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomLogSourceAttributes == false)
            return false;
        CustomLogSourceAttributes other = (CustomLogSourceAttributes) obj;
        if (other.getCrawlerArn() == null ^ this.getCrawlerArn() == null)
            return false;
        if (other.getCrawlerArn() != null && other.getCrawlerArn().equals(this.getCrawlerArn()) == false)
            return false;
        if (other.getDatabaseArn() == null ^ this.getDatabaseArn() == null)
            return false;
        if (other.getDatabaseArn() != null && other.getDatabaseArn().equals(this.getDatabaseArn()) == false)
            return false;
        if (other.getTableArn() == null ^ this.getTableArn() == null)
            return false;
        if (other.getTableArn() != null && other.getTableArn().equals(this.getTableArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawlerArn() == null) ? 0 : getCrawlerArn().hashCode());
        hashCode = prime * hashCode + ((getDatabaseArn() == null) ? 0 : getDatabaseArn().hashCode());
        hashCode = prime * hashCode + ((getTableArn() == null) ? 0 : getTableArn().hashCode());
        return hashCode;
    }

    @Override
    public CustomLogSourceAttributes clone() {
        try {
            return (CustomLogSourceAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.CustomLogSourceAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
