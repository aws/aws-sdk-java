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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies data lineage configuration settings for the crawler.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/LineageConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether data lineage is enabled for the crawler. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ENABLE: enables data lineage for the crawler
     * </p>
     * </li>
     * <li>
     * <p>
     * DISABLE: disables data lineage for the crawler
     * </p>
     * </li>
     * </ul>
     */
    private String crawlerLineageSettings;

    /**
     * <p>
     * Specifies whether data lineage is enabled for the crawler. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ENABLE: enables data lineage for the crawler
     * </p>
     * </li>
     * <li>
     * <p>
     * DISABLE: disables data lineage for the crawler
     * </p>
     * </li>
     * </ul>
     * 
     * @param crawlerLineageSettings
     *        Specifies whether data lineage is enabled for the crawler. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ENABLE: enables data lineage for the crawler
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DISABLE: disables data lineage for the crawler
     *        </p>
     *        </li>
     * @see CrawlerLineageSettings
     */

    public void setCrawlerLineageSettings(String crawlerLineageSettings) {
        this.crawlerLineageSettings = crawlerLineageSettings;
    }

    /**
     * <p>
     * Specifies whether data lineage is enabled for the crawler. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ENABLE: enables data lineage for the crawler
     * </p>
     * </li>
     * <li>
     * <p>
     * DISABLE: disables data lineage for the crawler
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether data lineage is enabled for the crawler. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ENABLE: enables data lineage for the crawler
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DISABLE: disables data lineage for the crawler
     *         </p>
     *         </li>
     * @see CrawlerLineageSettings
     */

    public String getCrawlerLineageSettings() {
        return this.crawlerLineageSettings;
    }

    /**
     * <p>
     * Specifies whether data lineage is enabled for the crawler. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ENABLE: enables data lineage for the crawler
     * </p>
     * </li>
     * <li>
     * <p>
     * DISABLE: disables data lineage for the crawler
     * </p>
     * </li>
     * </ul>
     * 
     * @param crawlerLineageSettings
     *        Specifies whether data lineage is enabled for the crawler. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ENABLE: enables data lineage for the crawler
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DISABLE: disables data lineage for the crawler
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CrawlerLineageSettings
     */

    public LineageConfiguration withCrawlerLineageSettings(String crawlerLineageSettings) {
        setCrawlerLineageSettings(crawlerLineageSettings);
        return this;
    }

    /**
     * <p>
     * Specifies whether data lineage is enabled for the crawler. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ENABLE: enables data lineage for the crawler
     * </p>
     * </li>
     * <li>
     * <p>
     * DISABLE: disables data lineage for the crawler
     * </p>
     * </li>
     * </ul>
     * 
     * @param crawlerLineageSettings
     *        Specifies whether data lineage is enabled for the crawler. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ENABLE: enables data lineage for the crawler
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DISABLE: disables data lineage for the crawler
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CrawlerLineageSettings
     */

    public LineageConfiguration withCrawlerLineageSettings(CrawlerLineageSettings crawlerLineageSettings) {
        this.crawlerLineageSettings = crawlerLineageSettings.toString();
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
        if (getCrawlerLineageSettings() != null)
            sb.append("CrawlerLineageSettings: ").append(getCrawlerLineageSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineageConfiguration == false)
            return false;
        LineageConfiguration other = (LineageConfiguration) obj;
        if (other.getCrawlerLineageSettings() == null ^ this.getCrawlerLineageSettings() == null)
            return false;
        if (other.getCrawlerLineageSettings() != null && other.getCrawlerLineageSettings().equals(this.getCrawlerLineageSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawlerLineageSettings() == null) ? 0 : getCrawlerLineageSettings().hashCode());
        return hashCode;
    }

    @Override
    public LineageConfiguration clone() {
        try {
            return (LineageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.LineageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
