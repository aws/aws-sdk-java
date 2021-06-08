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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a set of options that define the structure of either comma-separated value (CSV), Excel, or JSON input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/FormatOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormatOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Options that define how JSON input is to be interpreted by DataBrew.
     * </p>
     */
    private JsonOptions json;
    /**
     * <p>
     * Options that define how Excel input is to be interpreted by DataBrew.
     * </p>
     */
    private ExcelOptions excel;
    /**
     * <p>
     * Options that define how CSV input is to be interpreted by DataBrew.
     * </p>
     */
    private CsvOptions csv;

    /**
     * <p>
     * Options that define how JSON input is to be interpreted by DataBrew.
     * </p>
     * 
     * @param json
     *        Options that define how JSON input is to be interpreted by DataBrew.
     */

    public void setJson(JsonOptions json) {
        this.json = json;
    }

    /**
     * <p>
     * Options that define how JSON input is to be interpreted by DataBrew.
     * </p>
     * 
     * @return Options that define how JSON input is to be interpreted by DataBrew.
     */

    public JsonOptions getJson() {
        return this.json;
    }

    /**
     * <p>
     * Options that define how JSON input is to be interpreted by DataBrew.
     * </p>
     * 
     * @param json
     *        Options that define how JSON input is to be interpreted by DataBrew.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormatOptions withJson(JsonOptions json) {
        setJson(json);
        return this;
    }

    /**
     * <p>
     * Options that define how Excel input is to be interpreted by DataBrew.
     * </p>
     * 
     * @param excel
     *        Options that define how Excel input is to be interpreted by DataBrew.
     */

    public void setExcel(ExcelOptions excel) {
        this.excel = excel;
    }

    /**
     * <p>
     * Options that define how Excel input is to be interpreted by DataBrew.
     * </p>
     * 
     * @return Options that define how Excel input is to be interpreted by DataBrew.
     */

    public ExcelOptions getExcel() {
        return this.excel;
    }

    /**
     * <p>
     * Options that define how Excel input is to be interpreted by DataBrew.
     * </p>
     * 
     * @param excel
     *        Options that define how Excel input is to be interpreted by DataBrew.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormatOptions withExcel(ExcelOptions excel) {
        setExcel(excel);
        return this;
    }

    /**
     * <p>
     * Options that define how CSV input is to be interpreted by DataBrew.
     * </p>
     * 
     * @param csv
     *        Options that define how CSV input is to be interpreted by DataBrew.
     */

    public void setCsv(CsvOptions csv) {
        this.csv = csv;
    }

    /**
     * <p>
     * Options that define how CSV input is to be interpreted by DataBrew.
     * </p>
     * 
     * @return Options that define how CSV input is to be interpreted by DataBrew.
     */

    public CsvOptions getCsv() {
        return this.csv;
    }

    /**
     * <p>
     * Options that define how CSV input is to be interpreted by DataBrew.
     * </p>
     * 
     * @param csv
     *        Options that define how CSV input is to be interpreted by DataBrew.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormatOptions withCsv(CsvOptions csv) {
        setCsv(csv);
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
        if (getJson() != null)
            sb.append("Json: ").append(getJson()).append(",");
        if (getExcel() != null)
            sb.append("Excel: ").append(getExcel()).append(",");
        if (getCsv() != null)
            sb.append("Csv: ").append(getCsv());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FormatOptions == false)
            return false;
        FormatOptions other = (FormatOptions) obj;
        if (other.getJson() == null ^ this.getJson() == null)
            return false;
        if (other.getJson() != null && other.getJson().equals(this.getJson()) == false)
            return false;
        if (other.getExcel() == null ^ this.getExcel() == null)
            return false;
        if (other.getExcel() != null && other.getExcel().equals(this.getExcel()) == false)
            return false;
        if (other.getCsv() == null ^ this.getCsv() == null)
            return false;
        if (other.getCsv() != null && other.getCsv().equals(this.getCsv()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJson() == null) ? 0 : getJson().hashCode());
        hashCode = prime * hashCode + ((getExcel() == null) ? 0 : getExcel().hashCode());
        hashCode = prime * hashCode + ((getCsv() == null) ? 0 : getCsv().hashCode());
        return hashCode;
    }

    @Override
    public FormatOptions clone() {
        try {
            return (FormatOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.FormatOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
