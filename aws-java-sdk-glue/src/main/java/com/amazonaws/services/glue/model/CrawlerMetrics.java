/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Metrics for a specified crawler.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CrawlerMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrawlerMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the crawler.
     * </p>
     */
    private String crawlerName;
    /**
     * <p>
     * The estimated time left to complete a running crawl.
     * </p>
     */
    private Double timeLeftSeconds;
    /**
     * <p>
     * True if the crawler is still estimating how long it will take to complete this run.
     * </p>
     */
    private Boolean stillEstimating;
    /**
     * <p>
     * The duration of the crawler's most recent run, in seconds.
     * </p>
     */
    private Double lastRuntimeSeconds;
    /**
     * <p>
     * The median duration of this crawler's runs, in seconds.
     * </p>
     */
    private Double medianRuntimeSeconds;
    /**
     * <p>
     * The number of tables created by this crawler.
     * </p>
     */
    private Integer tablesCreated;
    /**
     * <p>
     * The number of tables updated by this crawler.
     * </p>
     */
    private Integer tablesUpdated;
    /**
     * <p>
     * The number of tables deleted by this crawler.
     * </p>
     */
    private Integer tablesDeleted;

    /**
     * <p>
     * The name of the crawler.
     * </p>
     * 
     * @param crawlerName
     *        The name of the crawler.
     */

    public void setCrawlerName(String crawlerName) {
        this.crawlerName = crawlerName;
    }

    /**
     * <p>
     * The name of the crawler.
     * </p>
     * 
     * @return The name of the crawler.
     */

    public String getCrawlerName() {
        return this.crawlerName;
    }

    /**
     * <p>
     * The name of the crawler.
     * </p>
     * 
     * @param crawlerName
     *        The name of the crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerMetrics withCrawlerName(String crawlerName) {
        setCrawlerName(crawlerName);
        return this;
    }

    /**
     * <p>
     * The estimated time left to complete a running crawl.
     * </p>
     * 
     * @param timeLeftSeconds
     *        The estimated time left to complete a running crawl.
     */

    public void setTimeLeftSeconds(Double timeLeftSeconds) {
        this.timeLeftSeconds = timeLeftSeconds;
    }

    /**
     * <p>
     * The estimated time left to complete a running crawl.
     * </p>
     * 
     * @return The estimated time left to complete a running crawl.
     */

    public Double getTimeLeftSeconds() {
        return this.timeLeftSeconds;
    }

    /**
     * <p>
     * The estimated time left to complete a running crawl.
     * </p>
     * 
     * @param timeLeftSeconds
     *        The estimated time left to complete a running crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerMetrics withTimeLeftSeconds(Double timeLeftSeconds) {
        setTimeLeftSeconds(timeLeftSeconds);
        return this;
    }

    /**
     * <p>
     * True if the crawler is still estimating how long it will take to complete this run.
     * </p>
     * 
     * @param stillEstimating
     *        True if the crawler is still estimating how long it will take to complete this run.
     */

    public void setStillEstimating(Boolean stillEstimating) {
        this.stillEstimating = stillEstimating;
    }

    /**
     * <p>
     * True if the crawler is still estimating how long it will take to complete this run.
     * </p>
     * 
     * @return True if the crawler is still estimating how long it will take to complete this run.
     */

    public Boolean getStillEstimating() {
        return this.stillEstimating;
    }

    /**
     * <p>
     * True if the crawler is still estimating how long it will take to complete this run.
     * </p>
     * 
     * @param stillEstimating
     *        True if the crawler is still estimating how long it will take to complete this run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerMetrics withStillEstimating(Boolean stillEstimating) {
        setStillEstimating(stillEstimating);
        return this;
    }

    /**
     * <p>
     * True if the crawler is still estimating how long it will take to complete this run.
     * </p>
     * 
     * @return True if the crawler is still estimating how long it will take to complete this run.
     */

    public Boolean isStillEstimating() {
        return this.stillEstimating;
    }

    /**
     * <p>
     * The duration of the crawler's most recent run, in seconds.
     * </p>
     * 
     * @param lastRuntimeSeconds
     *        The duration of the crawler's most recent run, in seconds.
     */

    public void setLastRuntimeSeconds(Double lastRuntimeSeconds) {
        this.lastRuntimeSeconds = lastRuntimeSeconds;
    }

    /**
     * <p>
     * The duration of the crawler's most recent run, in seconds.
     * </p>
     * 
     * @return The duration of the crawler's most recent run, in seconds.
     */

    public Double getLastRuntimeSeconds() {
        return this.lastRuntimeSeconds;
    }

    /**
     * <p>
     * The duration of the crawler's most recent run, in seconds.
     * </p>
     * 
     * @param lastRuntimeSeconds
     *        The duration of the crawler's most recent run, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerMetrics withLastRuntimeSeconds(Double lastRuntimeSeconds) {
        setLastRuntimeSeconds(lastRuntimeSeconds);
        return this;
    }

    /**
     * <p>
     * The median duration of this crawler's runs, in seconds.
     * </p>
     * 
     * @param medianRuntimeSeconds
     *        The median duration of this crawler's runs, in seconds.
     */

    public void setMedianRuntimeSeconds(Double medianRuntimeSeconds) {
        this.medianRuntimeSeconds = medianRuntimeSeconds;
    }

    /**
     * <p>
     * The median duration of this crawler's runs, in seconds.
     * </p>
     * 
     * @return The median duration of this crawler's runs, in seconds.
     */

    public Double getMedianRuntimeSeconds() {
        return this.medianRuntimeSeconds;
    }

    /**
     * <p>
     * The median duration of this crawler's runs, in seconds.
     * </p>
     * 
     * @param medianRuntimeSeconds
     *        The median duration of this crawler's runs, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerMetrics withMedianRuntimeSeconds(Double medianRuntimeSeconds) {
        setMedianRuntimeSeconds(medianRuntimeSeconds);
        return this;
    }

    /**
     * <p>
     * The number of tables created by this crawler.
     * </p>
     * 
     * @param tablesCreated
     *        The number of tables created by this crawler.
     */

    public void setTablesCreated(Integer tablesCreated) {
        this.tablesCreated = tablesCreated;
    }

    /**
     * <p>
     * The number of tables created by this crawler.
     * </p>
     * 
     * @return The number of tables created by this crawler.
     */

    public Integer getTablesCreated() {
        return this.tablesCreated;
    }

    /**
     * <p>
     * The number of tables created by this crawler.
     * </p>
     * 
     * @param tablesCreated
     *        The number of tables created by this crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerMetrics withTablesCreated(Integer tablesCreated) {
        setTablesCreated(tablesCreated);
        return this;
    }

    /**
     * <p>
     * The number of tables updated by this crawler.
     * </p>
     * 
     * @param tablesUpdated
     *        The number of tables updated by this crawler.
     */

    public void setTablesUpdated(Integer tablesUpdated) {
        this.tablesUpdated = tablesUpdated;
    }

    /**
     * <p>
     * The number of tables updated by this crawler.
     * </p>
     * 
     * @return The number of tables updated by this crawler.
     */

    public Integer getTablesUpdated() {
        return this.tablesUpdated;
    }

    /**
     * <p>
     * The number of tables updated by this crawler.
     * </p>
     * 
     * @param tablesUpdated
     *        The number of tables updated by this crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerMetrics withTablesUpdated(Integer tablesUpdated) {
        setTablesUpdated(tablesUpdated);
        return this;
    }

    /**
     * <p>
     * The number of tables deleted by this crawler.
     * </p>
     * 
     * @param tablesDeleted
     *        The number of tables deleted by this crawler.
     */

    public void setTablesDeleted(Integer tablesDeleted) {
        this.tablesDeleted = tablesDeleted;
    }

    /**
     * <p>
     * The number of tables deleted by this crawler.
     * </p>
     * 
     * @return The number of tables deleted by this crawler.
     */

    public Integer getTablesDeleted() {
        return this.tablesDeleted;
    }

    /**
     * <p>
     * The number of tables deleted by this crawler.
     * </p>
     * 
     * @param tablesDeleted
     *        The number of tables deleted by this crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerMetrics withTablesDeleted(Integer tablesDeleted) {
        setTablesDeleted(tablesDeleted);
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
        if (getCrawlerName() != null)
            sb.append("CrawlerName: ").append(getCrawlerName()).append(",");
        if (getTimeLeftSeconds() != null)
            sb.append("TimeLeftSeconds: ").append(getTimeLeftSeconds()).append(",");
        if (getStillEstimating() != null)
            sb.append("StillEstimating: ").append(getStillEstimating()).append(",");
        if (getLastRuntimeSeconds() != null)
            sb.append("LastRuntimeSeconds: ").append(getLastRuntimeSeconds()).append(",");
        if (getMedianRuntimeSeconds() != null)
            sb.append("MedianRuntimeSeconds: ").append(getMedianRuntimeSeconds()).append(",");
        if (getTablesCreated() != null)
            sb.append("TablesCreated: ").append(getTablesCreated()).append(",");
        if (getTablesUpdated() != null)
            sb.append("TablesUpdated: ").append(getTablesUpdated()).append(",");
        if (getTablesDeleted() != null)
            sb.append("TablesDeleted: ").append(getTablesDeleted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrawlerMetrics == false)
            return false;
        CrawlerMetrics other = (CrawlerMetrics) obj;
        if (other.getCrawlerName() == null ^ this.getCrawlerName() == null)
            return false;
        if (other.getCrawlerName() != null && other.getCrawlerName().equals(this.getCrawlerName()) == false)
            return false;
        if (other.getTimeLeftSeconds() == null ^ this.getTimeLeftSeconds() == null)
            return false;
        if (other.getTimeLeftSeconds() != null && other.getTimeLeftSeconds().equals(this.getTimeLeftSeconds()) == false)
            return false;
        if (other.getStillEstimating() == null ^ this.getStillEstimating() == null)
            return false;
        if (other.getStillEstimating() != null && other.getStillEstimating().equals(this.getStillEstimating()) == false)
            return false;
        if (other.getLastRuntimeSeconds() == null ^ this.getLastRuntimeSeconds() == null)
            return false;
        if (other.getLastRuntimeSeconds() != null && other.getLastRuntimeSeconds().equals(this.getLastRuntimeSeconds()) == false)
            return false;
        if (other.getMedianRuntimeSeconds() == null ^ this.getMedianRuntimeSeconds() == null)
            return false;
        if (other.getMedianRuntimeSeconds() != null && other.getMedianRuntimeSeconds().equals(this.getMedianRuntimeSeconds()) == false)
            return false;
        if (other.getTablesCreated() == null ^ this.getTablesCreated() == null)
            return false;
        if (other.getTablesCreated() != null && other.getTablesCreated().equals(this.getTablesCreated()) == false)
            return false;
        if (other.getTablesUpdated() == null ^ this.getTablesUpdated() == null)
            return false;
        if (other.getTablesUpdated() != null && other.getTablesUpdated().equals(this.getTablesUpdated()) == false)
            return false;
        if (other.getTablesDeleted() == null ^ this.getTablesDeleted() == null)
            return false;
        if (other.getTablesDeleted() != null && other.getTablesDeleted().equals(this.getTablesDeleted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawlerName() == null) ? 0 : getCrawlerName().hashCode());
        hashCode = prime * hashCode + ((getTimeLeftSeconds() == null) ? 0 : getTimeLeftSeconds().hashCode());
        hashCode = prime * hashCode + ((getStillEstimating() == null) ? 0 : getStillEstimating().hashCode());
        hashCode = prime * hashCode + ((getLastRuntimeSeconds() == null) ? 0 : getLastRuntimeSeconds().hashCode());
        hashCode = prime * hashCode + ((getMedianRuntimeSeconds() == null) ? 0 : getMedianRuntimeSeconds().hashCode());
        hashCode = prime * hashCode + ((getTablesCreated() == null) ? 0 : getTablesCreated().hashCode());
        hashCode = prime * hashCode + ((getTablesUpdated() == null) ? 0 : getTablesUpdated().hashCode());
        hashCode = prime * hashCode + ((getTablesDeleted() == null) ? 0 : getTablesDeleted().hashCode());
        return hashCode;
    }

    @Override
    public CrawlerMetrics clone() {
        try {
            return (CrawlerMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CrawlerMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
