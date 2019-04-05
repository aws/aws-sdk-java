/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * Describes how results of the Select job are serialized.
 */
public class OutputSerialization implements Serializable, Cloneable {

    /**
     * Describes the serialization of CSV-encoded Select results.
     */
    private CSVOutput csv;

    private JSONOutput json;

    /**
     * @return the serialization of CSV-encoded Select results.
     */
    public CSVOutput getCsv() {
        return csv;
    }

    /**
     * Sets the serialization of CSV-encoded Select results.
     *
     * @param csv The new csv value.
     */
    public void setCsv(CSVOutput csv) {
        this.csv = csv;
    }

    /**
     * Sets the serialization of CSV-encoded Select results.
     *
     * @param csvOutput The new csv value.
     * @return This object for method chaining.
     */
    public OutputSerialization withCsv(CSVOutput csvOutput) {
        setCsv(csvOutput);
        return this;
    }

    /**
     * Specifies JSON as request's output serialization format.
     */
    public JSONOutput getJson() {
        return json;
    }

    /**
     * Specifies JSON as request's output serialization format.
     */
    public void setJson(JSONOutput json) {
        this.json = json;
    }

    /**
     * Specifies JSON as request's output serialization format.
     */
    public OutputSerialization withJson(JSONOutput json) {
        setJson(json);
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ! (obj instanceof OutputSerialization)) {
            return false;
        }

        final OutputSerialization other = (OutputSerialization) obj;

        if (other.getCsv() == null ^ this.getCsv() == null)
            return false;
        if (other.getCsv() != null && !other.getCsv().equals(this.getCsv()))
            return false;
        if (other.getJson() == null ^ this.getJson() == null)
            return false;
        if (other.getJson() != null && !other.getJson().equals(this.getJson()))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCsv() == null) ? 0 : getCsv().hashCode());
        hashCode = prime * hashCode + ((getJson() == null) ? 0 : getJson().hashCode());
        return hashCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCsv() != null)
            sb.append("CSV: ").append(getCsv());
        if (getJson() != null)
            sb.append("JSON: ").append(getJson());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public OutputSerialization clone() {
        try {
            return (OutputSerialization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
