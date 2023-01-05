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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/BatchGetRumMetricDefinitions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetRumMetricDefinitionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the CloudWatch RUM app monitor that is sending the metrics.
     * </p>
     */
    private String appMonitorName;
    /**
     * <p>
     * The type of destination that you want to view metrics for. Valid values are <code>CloudWatch</code> and
     * <code>Evidently</code>.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * This parameter is required if <code>Destination</code> is <code>Evidently</code>. If <code>Destination</code> is
     * <code>CloudWatch</code>, do not use this parameter.
     * </p>
     * <p>
     * This parameter specifies the ARN of the Evidently experiment that corresponds to the destination.
     * </p>
     */
    private String destinationArn;
    /**
     * <p>
     * The maximum number of results to return in one operation. The default is 50. The maximum that you can specify is
     * 100.
     * </p>
     * <p>
     * To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Use the token returned by the previous operation to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the CloudWatch RUM app monitor that is sending the metrics.
     * </p>
     * 
     * @param appMonitorName
     *        The name of the CloudWatch RUM app monitor that is sending the metrics.
     */

    public void setAppMonitorName(String appMonitorName) {
        this.appMonitorName = appMonitorName;
    }

    /**
     * <p>
     * The name of the CloudWatch RUM app monitor that is sending the metrics.
     * </p>
     * 
     * @return The name of the CloudWatch RUM app monitor that is sending the metrics.
     */

    public String getAppMonitorName() {
        return this.appMonitorName;
    }

    /**
     * <p>
     * The name of the CloudWatch RUM app monitor that is sending the metrics.
     * </p>
     * 
     * @param appMonitorName
     *        The name of the CloudWatch RUM app monitor that is sending the metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRumMetricDefinitionsRequest withAppMonitorName(String appMonitorName) {
        setAppMonitorName(appMonitorName);
        return this;
    }

    /**
     * <p>
     * The type of destination that you want to view metrics for. Valid values are <code>CloudWatch</code> and
     * <code>Evidently</code>.
     * </p>
     * 
     * @param destination
     *        The type of destination that you want to view metrics for. Valid values are <code>CloudWatch</code> and
     *        <code>Evidently</code>.
     * @see MetricDestination
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The type of destination that you want to view metrics for. Valid values are <code>CloudWatch</code> and
     * <code>Evidently</code>.
     * </p>
     * 
     * @return The type of destination that you want to view metrics for. Valid values are <code>CloudWatch</code> and
     *         <code>Evidently</code>.
     * @see MetricDestination
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The type of destination that you want to view metrics for. Valid values are <code>CloudWatch</code> and
     * <code>Evidently</code>.
     * </p>
     * 
     * @param destination
     *        The type of destination that you want to view metrics for. Valid values are <code>CloudWatch</code> and
     *        <code>Evidently</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricDestination
     */

    public BatchGetRumMetricDefinitionsRequest withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The type of destination that you want to view metrics for. Valid values are <code>CloudWatch</code> and
     * <code>Evidently</code>.
     * </p>
     * 
     * @param destination
     *        The type of destination that you want to view metrics for. Valid values are <code>CloudWatch</code> and
     *        <code>Evidently</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricDestination
     */

    public BatchGetRumMetricDefinitionsRequest withDestination(MetricDestination destination) {
        this.destination = destination.toString();
        return this;
    }

    /**
     * <p>
     * This parameter is required if <code>Destination</code> is <code>Evidently</code>. If <code>Destination</code> is
     * <code>CloudWatch</code>, do not use this parameter.
     * </p>
     * <p>
     * This parameter specifies the ARN of the Evidently experiment that corresponds to the destination.
     * </p>
     * 
     * @param destinationArn
     *        This parameter is required if <code>Destination</code> is <code>Evidently</code>. If
     *        <code>Destination</code> is <code>CloudWatch</code>, do not use this parameter.</p>
     *        <p>
     *        This parameter specifies the ARN of the Evidently experiment that corresponds to the destination.
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * This parameter is required if <code>Destination</code> is <code>Evidently</code>. If <code>Destination</code> is
     * <code>CloudWatch</code>, do not use this parameter.
     * </p>
     * <p>
     * This parameter specifies the ARN of the Evidently experiment that corresponds to the destination.
     * </p>
     * 
     * @return This parameter is required if <code>Destination</code> is <code>Evidently</code>. If
     *         <code>Destination</code> is <code>CloudWatch</code>, do not use this parameter.</p>
     *         <p>
     *         This parameter specifies the ARN of the Evidently experiment that corresponds to the destination.
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * This parameter is required if <code>Destination</code> is <code>Evidently</code>. If <code>Destination</code> is
     * <code>CloudWatch</code>, do not use this parameter.
     * </p>
     * <p>
     * This parameter specifies the ARN of the Evidently experiment that corresponds to the destination.
     * </p>
     * 
     * @param destinationArn
     *        This parameter is required if <code>Destination</code> is <code>Evidently</code>. If
     *        <code>Destination</code> is <code>CloudWatch</code>, do not use this parameter.</p>
     *        <p>
     *        This parameter specifies the ARN of the Evidently experiment that corresponds to the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRumMetricDefinitionsRequest withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation. The default is 50. The maximum that you can specify is
     * 100.
     * </p>
     * <p>
     * To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in one operation. The default is 50. The maximum that you can
     *        specify is 100.</p>
     *        <p>
     *        To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation. The default is 50. The maximum that you can specify is
     * 100.
     * </p>
     * <p>
     * To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return in one operation. The default is 50. The maximum that you can
     *         specify is 100.</p>
     *         <p>
     *         To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation. The default is 50. The maximum that you can specify is
     * 100.
     * </p>
     * <p>
     * To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in one operation. The default is 50. The maximum that you can
     *        specify is 100.</p>
     *        <p>
     *        To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRumMetricDefinitionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Use the token returned by the previous operation to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Use the token returned by the previous operation to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Use the token returned by the previous operation to request the next page of results.
     * </p>
     * 
     * @return Use the token returned by the previous operation to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Use the token returned by the previous operation to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Use the token returned by the previous operation to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRumMetricDefinitionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAppMonitorName() != null)
            sb.append("AppMonitorName: ").append(getAppMonitorName()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getDestinationArn() != null)
            sb.append("DestinationArn: ").append(getDestinationArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetRumMetricDefinitionsRequest == false)
            return false;
        BatchGetRumMetricDefinitionsRequest other = (BatchGetRumMetricDefinitionsRequest) obj;
        if (other.getAppMonitorName() == null ^ this.getAppMonitorName() == null)
            return false;
        if (other.getAppMonitorName() != null && other.getAppMonitorName().equals(this.getAppMonitorName()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppMonitorName() == null) ? 0 : getAppMonitorName().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetRumMetricDefinitionsRequest clone() {
        return (BatchGetRumMetricDefinitionsRequest) super.clone();
    }

}
