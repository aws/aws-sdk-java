/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWS3Signer;
import com.amazonaws.auth.QueryStringSigner;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.StandardErrorUnmarshaller;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.services.cloudwatch.model.transform.*;


/**
 * Client for accessing AmazonCloudWatch.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * Amazon CloudWatch <p>
 * Amazon CloudWatch is a web service that enables you to monitor and
 * manage various metrics, as well as configure alarm actions based on
 * data from metrics.
 * </p>
 * <p>
 * Amazon CloudWatch monitoring enables you to collect, analyze, and view
 * system and application metrics so that you can make operational and
 * business decisions more quickly and with greater confidence. You can
 * use Amazon CloudWatch to collect metrics about your AWS resources,
 * such as the performance of your Amazon EC2 instances.
 * </p>
 * <p>
 * If you are registered for an AWS product that supports Amazon
 * CloudWatch, the service automatically pushes basic metrics to
 * CloudWatch for you. Once Amazon CloudWatch contains metrics, you can
 * calculate statistics based on that data.
 * </p>
 * <p>
 * Amazon CloudWatch alarms help you implement decisions more easily by
 * enabling you do things like send notifications or automatically make
 * changes to the resources you are monitoring, based on rules that you
 * define. For example, you can create alarms that initiate Auto Scaling
 * and Simple Notification Service actions on your behalf.
 * </p>
 */
public class AmazonCloudWatchClient extends AmazonWebServiceClient implements AmazonCloudWatch {

    /**
     * The AWS credentials (access key ID and secret key) to use when
     * authenticating with AWS services.
     */
    private AWSCredentials awsCredentials;

    /**
     * List of exception unmarshallers for all AmazonCloudWatch exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers;

    /** Optional request handlers for additional request processing. */
    private final List<RequestHandler> requestHandlers;
    
    /** AWS signer for authenticating requests. */
    private QueryStringSigner signer;


    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudWatch using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonCloudWatchClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudWatch using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCloudWatch
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCloudWatchClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentials = awsCredentials;

        exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();
        exceptionUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterCombinationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidFormatExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InternalServiceExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingRequiredParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        setEndpoint("monitoring.amazonaws.com");

        signer = new QueryStringSigner();

        HandlerChainFactory chainFactory = new HandlerChainFactory();
		requestHandlers = Collections.synchronizedList(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/cloudwatch/request.handlers"));
    }

	/**
	 * Appends a request handler to the list of registered handlers that are run
	 * as part of a request's lifecycle.
	 *
	 * @param requestHandler
	 *            The new handler to add to the current list of request
	 *            handlers.
	 */
    public void addRequestHandler(RequestHandler requestHandler) {
    	requestHandlers.add(requestHandler);
    }

    
    /**
     * <p>
     * Creates or updates an alarm and associates it with the specified
     * Amazon CloudWatch metric. Optionally, this operation can associate one
     * or more Amazon Simple Notification Service resources with the alarm.
     * </p>
     * <p>
     * When this operation creates an alarm, the alarm state is immediately
     * set to <code>INSUFFICIENT_DATA</code> . The alarm is evaluated and
     * its <code>StateValue</code> is set appropriately. Any actions
     * associated with the <code>StateValue</code> is then executed.
     * </p>
     * <p>
     * <b>NOTE:</b> When updating an existing alarm, its StateValue is left
     * unchanged.
     * </p>
     *
     * @param putMetricAlarmRequest Container for the necessary parameters to
     *           execute the PutMetricAlarm service method on AmazonCloudWatch.
     * 
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putMetricAlarm(PutMetricAlarmRequest putMetricAlarmRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<PutMetricAlarmRequest> request = new PutMetricAlarmRequestMarshaller().marshall(putMetricAlarmRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Returns a list of valid metrics stored for the AWS account owner.
     * Returned metrics can be used with <code>GetMetricStatistics</code> to
     * obtain statistical data for a given metric.
     * </p>
     * <p>
     * <b>NOTE:</b> Up to 500 results are returned for any one call. To
     * retrieve further results, use returned NextToken values with
     * subsequent ListMetrics operations.
     * </p>
     *
     * @param listMetricsRequest Container for the necessary parameters to
     *           execute the ListMetrics service method on AmazonCloudWatch.
     * 
     * @return The response from the ListMetrics service method, as returned
     *         by AmazonCloudWatch.
     * 
     * @throws InternalServiceException
     * @throws InvalidParameterValueException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListMetricsResult listMetrics(ListMetricsRequest listMetricsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ListMetricsRequest> request = new ListMetricsRequestMarshaller().marshall(listMetricsRequest);
        return invoke(request, new ListMetricsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Gets statistics for the specified metric.
     * </p>
     * <p>
     * <b>NOTE:</b> The maximum number of datapoints returned from a single
     * GetMetricStatistics request is 1,440. If a request is made that
     * generates more than 1,440 datapoints, Amazon CloudWatch returns an
     * error. In such a case, alter the request by narrowing the specified
     * time range or increasing the specified period. Alternatively, make
     * multiple requests across adjacent time ranges.
     * </p>
     *
     * @param getMetricStatisticsRequest Container for the necessary
     *           parameters to execute the GetMetricStatistics service method on
     *           AmazonCloudWatch.
     * 
     * @return The response from the GetMetricStatistics service method, as
     *         returned by AmazonCloudWatch.
     * 
     * @throws InvalidParameterValueException
     * @throws InternalServiceException
     * @throws InvalidParameterCombinationException
     * @throws MissingRequiredParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetMetricStatisticsResult getMetricStatistics(GetMetricStatisticsRequest getMetricStatisticsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<GetMetricStatisticsRequest> request = new GetMetricStatisticsRequestMarshaller().marshall(getMetricStatisticsRequest);
        return invoke(request, new GetMetricStatisticsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Disables actions for the specified alarms. When an alarm's actions
     * are disabled the alarm's state may change, but none of the alarm's
     * actions will execute.
     * </p>
     *
     * @param disableAlarmActionsRequest Container for the necessary
     *           parameters to execute the DisableAlarmActions service method on
     *           AmazonCloudWatch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void disableAlarmActions(DisableAlarmActionsRequest disableAlarmActionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DisableAlarmActionsRequest> request = new DisableAlarmActionsRequestMarshaller().marshall(disableAlarmActionsRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Retrieves alarms with the specified names. If no name is specified,
     * all alarms for the user are returned. Alarms can be retrieved by using
     * only a prefix for the alarm name, the alarm state, or a prefix for any
     * action.
     * </p>
     *
     * @param describeAlarmsRequest Container for the necessary parameters to
     *           execute the DescribeAlarms service method on AmazonCloudWatch.
     * 
     * @return The response from the DescribeAlarms service method, as
     *         returned by AmazonCloudWatch.
     * 
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAlarmsResult describeAlarms(DescribeAlarmsRequest describeAlarmsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeAlarmsRequest> request = new DescribeAlarmsRequestMarshaller().marshall(describeAlarmsRequest);
        return invoke(request, new DescribeAlarmsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Retrieves all alarms for a single metric. Specify a statistic,
     * period, or unit to filter the set of alarms further.
     * </p>
     *
     * @param describeAlarmsForMetricRequest Container for the necessary
     *           parameters to execute the DescribeAlarmsForMetric service method on
     *           AmazonCloudWatch.
     * 
     * @return The response from the DescribeAlarmsForMetric service method,
     *         as returned by AmazonCloudWatch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAlarmsForMetricResult describeAlarmsForMetric(DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeAlarmsForMetricRequest> request = new DescribeAlarmsForMetricRequestMarshaller().marshall(describeAlarmsForMetricRequest);
        return invoke(request, new DescribeAlarmsForMetricResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Retrieves history for the specified alarm. Filter alarms by date
     * range or item type. If an alarm name is not specified, Amazon
     * CloudWatch returns histories for all of the owner's alarms.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon CloudWatch retains the history of deleted alarms
     * for a period of six weeks. If an alarm has been deleted, its history
     * can still be queried.
     * </p>
     *
     * @param describeAlarmHistoryRequest Container for the necessary
     *           parameters to execute the DescribeAlarmHistory service method on
     *           AmazonCloudWatch.
     * 
     * @return The response from the DescribeAlarmHistory service method, as
     *         returned by AmazonCloudWatch.
     * 
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAlarmHistoryResult describeAlarmHistory(DescribeAlarmHistoryRequest describeAlarmHistoryRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeAlarmHistoryRequest> request = new DescribeAlarmHistoryRequestMarshaller().marshall(describeAlarmHistoryRequest);
        return invoke(request, new DescribeAlarmHistoryResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Enables actions for the specified alarms.
     * </p>
     *
     * @param enableAlarmActionsRequest Container for the necessary
     *           parameters to execute the EnableAlarmActions service method on
     *           AmazonCloudWatch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void enableAlarmActions(EnableAlarmActionsRequest enableAlarmActionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<EnableAlarmActionsRequest> request = new EnableAlarmActionsRequestMarshaller().marshall(enableAlarmActionsRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Deletes all specified alarms. In the event of an error, no alarms are
     * deleted.
     * </p>
     *
     * @param deleteAlarmsRequest Container for the necessary parameters to
     *           execute the DeleteAlarms service method on AmazonCloudWatch.
     * 
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteAlarms(DeleteAlarmsRequest deleteAlarmsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteAlarmsRequest> request = new DeleteAlarmsRequestMarshaller().marshall(deleteAlarmsRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Temporarily sets the state of an alarm. When the updated
     * <code>StateValue</code> differs from the previous value, the action
     * configured for the appropriate state is invoked. This is not a
     * permanent change. The next periodic alarm check (in about a minute)
     * will set the alarm to its actual state.
     * </p>
     *
     * @param setAlarmStateRequest Container for the necessary parameters to
     *           execute the SetAlarmState service method on AmazonCloudWatch.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidFormatException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setAlarmState(SetAlarmStateRequest setAlarmStateRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<SetAlarmStateRequest> request = new SetAlarmStateRequestMarshaller().marshall(setAlarmStateRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Returns a list of valid metrics stored for the AWS account owner.
     * Returned metrics can be used with <code>GetMetricStatistics</code> to
     * obtain statistical data for a given metric.
     * </p>
     * <p>
     * <b>NOTE:</b> Up to 500 results are returned for any one call. To
     * retrieve further results, use returned NextToken values with
     * subsequent ListMetrics operations.
     * </p>
     * 
     * @return The response from the ListMetrics service method, as returned
     *         by AmazonCloudWatch.
     * 
     * @throws InternalServiceException
     * @throws InvalidParameterValueException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListMetricsResult listMetrics() throws AmazonServiceException, AmazonClientException {
        return listMetrics(new ListMetricsRequest());
    }
    
    /**
     * <p>
     * Retrieves alarms with the specified names. If no name is specified,
     * all alarms for the user are returned. Alarms can be retrieved by using
     * only a prefix for the alarm name, the alarm state, or a prefix for any
     * action.
     * </p>
     * 
     * @return The response from the DescribeAlarms service method, as
     *         returned by AmazonCloudWatch.
     * 
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAlarmsResult describeAlarms() throws AmazonServiceException, AmazonClientException {
        return describeAlarms(new DescribeAlarmsRequest());
    }
    
    /**
     * <p>
     * Retrieves history for the specified alarm. Filter alarms by date
     * range or item type. If an alarm name is not specified, Amazon
     * CloudWatch returns histories for all of the owner's alarms.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon CloudWatch retains the history of deleted alarms
     * for a period of six weeks. If an alarm has been deleted, its history
     * can still be queried.
     * </p>
     * 
     * @return The response from the DescribeAlarmHistory service method, as
     *         returned by AmazonCloudWatch.
     * 
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAlarmHistoryResult describeAlarmHistory() throws AmazonServiceException, AmazonClientException {
        return describeAlarmHistory(new DescribeAlarmHistoryRequest());
    }
    


    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request, Unmarshaller<X, StaxUnmarshallerContext> unmarshaller) {
        request.setEndpoint(endpoint);
        for (Entry<String, String> entry : request.getOriginalRequest().copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        // Apply any additional service specific request handlers that need to be run
        if (requestHandlers != null) {
            for (RequestHandler requestHandler : requestHandlers) {
                requestHandler.beforeRequest(request);
            }
        }

        if (request.getOriginalRequest().getRequestCredentials() != null) {
	        signer.sign(request, request.getOriginalRequest().getRequestCredentials());
        } else {
    	    signer.sign(request, awsCredentials);
        }

        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        ExecutionContext executionContext = new ExecutionContext(requestHandlers);
        return (X)client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        