/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateCrawlerSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCrawlerScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the crawler whose schedule to update.
     * </p>
     */
    private String crawlerName;
    /**
     * <p>
     * Cron expression of the updated schedule.
     * </p>
     */
    private String schedule;

    /**
     * <p>
     * Name of the crawler whose schedule to update.
     * </p>
     * 
     * @param crawlerName
     *        Name of the crawler whose schedule to update.
     */

    public void setCrawlerName(String crawlerName) {
        this.crawlerName = crawlerName;
    }

    /**
     * <p>
     * Name of the crawler whose schedule to update.
     * </p>
     * 
     * @return Name of the crawler whose schedule to update.
     */

    public String getCrawlerName() {
        return this.crawlerName;
    }

    /**
     * <p>
     * Name of the crawler whose schedule to update.
     * </p>
     * 
     * @param crawlerName
     *        Name of the crawler whose schedule to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCrawlerScheduleRequest withCrawlerName(String crawlerName) {
        setCrawlerName(crawlerName);
        return this;
    }

    /**
     * <p>
     * Cron expression of the updated schedule.
     * </p>
     * 
     * @param schedule
     *        Cron expression of the updated schedule.
     */

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * Cron expression of the updated schedule.
     * </p>
     * 
     * @return Cron expression of the updated schedule.
     */

    public String getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * Cron expression of the updated schedule.
     * </p>
     * 
     * @param schedule
     *        Cron expression of the updated schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCrawlerScheduleRequest withSchedule(String schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCrawlerScheduleRequest == false)
            return false;
        UpdateCrawlerScheduleRequest other = (UpdateCrawlerScheduleRequest) obj;
        if (other.getCrawlerName() == null ^ this.getCrawlerName() == null)
            return false;
        if (other.getCrawlerName() != null && other.getCrawlerName().equals(this.getCrawlerName()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawlerName() == null) ? 0 : getCrawlerName().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCrawlerScheduleRequest clone() {
        return (UpdateCrawlerScheduleRequest) super.clone();
    }

}
