package io.swagger.api;

import io.swagger.model.Action2;
import io.swagger.model.Action3;
import io.swagger.model.Agent2;
import io.swagger.model.Agent3;
import io.swagger.model.InlineResponse20010;
import io.swagger.model.InlineResponse20011;
import io.swagger.model.InlineResponse20012;
import io.swagger.model.InlineResponse20013;
import io.swagger.model.InlineResponse20014;
import io.swagger.model.InlineResponse20015;
import io.swagger.model.InlineResponse20016;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2009;
import io.swagger.model.InlineResponse2009SchedulesAction;
import io.swagger.model.InlineResponse2009SchedulesSchedule;
import io.swagger.model.InlineResponse2009SuppressionsSuppression;
import io.swagger.model.InlineResponse2009TasksTask;
import io.swagger.model.InlineResponse200TasksMetric;
import java.util.List;
import io.swagger.model.Lmapstate;
import io.swagger.model.Lmapstate1;
import io.swagger.model.Metric2;
import io.swagger.model.Metric3;
import io.swagger.model.Schedule2;
import io.swagger.model.Schedule3;
import io.swagger.model.Schedules2;
import io.swagger.model.Schedules3;
import io.swagger.model.Suppression2;
import io.swagger.model.Suppression3;
import io.swagger.model.Suppressions2;
import io.swagger.model.Suppressions3;
import io.swagger.model.Task2;
import io.swagger.model.Task3;
import io.swagger.model.Tasks2;
import io.swagger.model.Tasks3;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

@Controller
public class IetfLmapControllmapStateApiController implements IetfLmapControllmapStateApi {



    public ResponseEntity<Void> ietfLmapControllmapStateAgentDelete() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20010> ietfLmapControllmapStateAgentGet() {
        // do some magic!
        return new ResponseEntity<InlineResponse20010>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20010> ietfLmapControllmapStateAgentPatch(@ApiParam(value = "Operations state of the measurement agent."  ) @RequestBody Agent3 agent) {
        // do some magic!
        return new ResponseEntity<InlineResponse20010>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20010> ietfLmapControllmapStateAgentPut(@ApiParam(value = "Operations state of the measurement agent."  ) @RequestBody Agent2 agent) {
        // do some magic!
        return new ResponseEntity<InlineResponse20010>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateDelete() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2009> ietfLmapControllmapStateGet() {
        // do some magic!
        return new ResponseEntity<InlineResponse2009>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2009> ietfLmapControllmapStatePatch(@ApiParam(value = "A tree exporting state information about the LMAP agent."  ) @RequestBody Lmapstate1 lmapState) {
        // do some magic!
        return new ResponseEntity<InlineResponse2009>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2009> ietfLmapControllmapStatePut(@ApiParam(value = "A tree exporting state information about the LMAP agent."  ) @RequestBody Lmapstate lmapState) {
        // do some magic!
        return new ResponseEntity<InlineResponse2009>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateSchedulesDelete() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20012> ietfLmapControllmapStateSchedulesGet() {
        // do some magic!
        return new ResponseEntity<InlineResponse20012>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20012> ietfLmapControllmapStateSchedulesPatch(@ApiParam(value = "State of LMAP schedules."  ) @RequestBody Schedules3 schedules) {
        // do some magic!
        return new ResponseEntity<InlineResponse20012>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20012> ietfLmapControllmapStateSchedulesPut(@ApiParam(value = "State of LMAP schedules."  ) @RequestBody Schedules2 schedules) {
        // do some magic!
        return new ResponseEntity<InlineResponse20012>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse2009SchedulesSchedule>> ietfLmapControllmapStateSchedulesScheduleGet() {
        // do some magic!
        return new ResponseEntity<List<InlineResponse2009SchedulesSchedule>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateSchedulesSchedulePatch(@ApiParam(value = "State of a particular schedule."  ) @RequestBody List<InlineResponse2009SchedulesSchedule> schedule) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse2009SchedulesSchedule>> ietfLmapControllmapStateSchedulesSchedulePost(@ApiParam(value = "State of a particular schedule."  ) @RequestBody List<InlineResponse2009SchedulesSchedule> schedule) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse2009SchedulesSchedule>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateSchedulesSchedulePut(@ApiParam(value = "State of a particular schedule."  ) @RequestBody List<InlineResponse2009SchedulesSchedule> schedule) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse2009SchedulesAction>> ietfLmapControllmapStateSchedulesScheduleScheduleNameActionGet(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse2009SchedulesAction>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateSchedulesScheduleScheduleNameActionNameDelete(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20014> ietfLmapControllmapStateSchedulesScheduleScheduleNameActionNameGet(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName) {
        // do some magic!
        return new ResponseEntity<InlineResponse20014>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20014> ietfLmapControllmapStateSchedulesScheduleScheduleNameActionNamePatch(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "The state of the actions associated with this schedule entry."  ) @RequestBody Action3 action) {
        // do some magic!
        return new ResponseEntity<InlineResponse20014>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20014> ietfLmapControllmapStateSchedulesScheduleScheduleNameActionNamePut(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "The state of the actions associated with this schedule entry."  ) @RequestBody Action2 action) {
        // do some magic!
        return new ResponseEntity<InlineResponse20014>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateSchedulesScheduleScheduleNameActionPatch(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "The state of the actions associated with this schedule entry."  ) @RequestBody List<InlineResponse2009SchedulesAction> action) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse2009SchedulesAction>> ietfLmapControllmapStateSchedulesScheduleScheduleNameActionPost(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "The state of the actions associated with this schedule entry."  ) @RequestBody List<InlineResponse2009SchedulesAction> action) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse2009SchedulesAction>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateSchedulesScheduleScheduleNameActionPut(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "The state of the actions associated with this schedule entry."  ) @RequestBody List<InlineResponse2009SchedulesAction> action) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateSchedulesScheduleScheduleNameDelete(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20013> ietfLmapControllmapStateSchedulesScheduleScheduleNameGet(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName) {
        // do some magic!
        return new ResponseEntity<InlineResponse20013>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20013> ietfLmapControllmapStateSchedulesScheduleScheduleNamePatch(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "State of a particular schedule."  ) @RequestBody Schedule3 schedule) {
        // do some magic!
        return new ResponseEntity<InlineResponse20013>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20013> ietfLmapControllmapStateSchedulesScheduleScheduleNamePut(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "State of a particular schedule."  ) @RequestBody Schedule2 schedule) {
        // do some magic!
        return new ResponseEntity<InlineResponse20013>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateSuppressionsDelete() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20015> ietfLmapControllmapStateSuppressionsGet() {
        // do some magic!
        return new ResponseEntity<InlineResponse20015>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20015> ietfLmapControllmapStateSuppressionsPatch(@ApiParam(value = "State of LMAP suppressions."  ) @RequestBody Suppressions3 suppressions) {
        // do some magic!
        return new ResponseEntity<InlineResponse20015>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20015> ietfLmapControllmapStateSuppressionsPut(@ApiParam(value = "State of LMAP suppressions."  ) @RequestBody Suppressions2 suppressions) {
        // do some magic!
        return new ResponseEntity<InlineResponse20015>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse2009SuppressionsSuppression>> ietfLmapControllmapStateSuppressionsSuppressionGet() {
        // do some magic!
        return new ResponseEntity<List<InlineResponse2009SuppressionsSuppression>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateSuppressionsSuppressionNameDelete(@ApiParam(value = "The locally-unique, administratively assigned name for this suppression.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20016> ietfLmapControllmapStateSuppressionsSuppressionNameGet(@ApiParam(value = "The locally-unique, administratively assigned name for this suppression.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<InlineResponse20016>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20016> ietfLmapControllmapStateSuppressionsSuppressionNamePatch(@ApiParam(value = "The locally-unique, administratively assigned name for this suppression.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "State of a particular suppression."  ) @RequestBody Suppression3 suppression) {
        // do some magic!
        return new ResponseEntity<InlineResponse20016>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20016> ietfLmapControllmapStateSuppressionsSuppressionNamePut(@ApiParam(value = "The locally-unique, administratively assigned name for this suppression.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "State of a particular suppression."  ) @RequestBody Suppression2 suppression) {
        // do some magic!
        return new ResponseEntity<InlineResponse20016>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateSuppressionsSuppressionPatch(@ApiParam(value = "State of a particular suppression."  ) @RequestBody List<InlineResponse2009SuppressionsSuppression> suppression) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse2009SuppressionsSuppression>> ietfLmapControllmapStateSuppressionsSuppressionPost(@ApiParam(value = "State of a particular suppression."  ) @RequestBody List<InlineResponse2009SuppressionsSuppression> suppression) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse2009SuppressionsSuppression>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateSuppressionsSuppressionPut(@ApiParam(value = "State of a particular suppression."  ) @RequestBody List<InlineResponse2009SuppressionsSuppression> suppression) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateTasksDelete() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20011> ietfLmapControllmapStateTasksGet() {
        // do some magic!
        return new ResponseEntity<InlineResponse20011>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20011> ietfLmapControllmapStateTasksPatch(@ApiParam(value = "Available LMAP tasks, including information about their last execution and their last failed execution."  ) @RequestBody Tasks3 tasks) {
        // do some magic!
        return new ResponseEntity<InlineResponse20011>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20011> ietfLmapControllmapStateTasksPut(@ApiParam(value = "Available LMAP tasks, including information about their last execution and their last failed execution."  ) @RequestBody Tasks2 tasks) {
        // do some magic!
        return new ResponseEntity<InlineResponse20011>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse2009TasksTask>> ietfLmapControllmapStateTasksTaskGet() {
        // do some magic!
        return new ResponseEntity<List<InlineResponse2009TasksTask>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateTasksTaskNameDelete(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2009TasksTask> ietfLmapControllmapStateTasksTaskNameGet(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<InlineResponse2009TasksTask>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200TasksMetric>> ietfLmapControllmapStateTasksTaskNameMetricGet(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200TasksMetric>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateTasksTaskNameMetricPatch(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody List<InlineResponse200TasksMetric> metric) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200TasksMetric>> ietfLmapControllmapStateTasksTaskNameMetricPost(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody List<InlineResponse200TasksMetric> metric) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200TasksMetric>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateTasksTaskNameMetricPut(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody List<InlineResponse200TasksMetric> metric) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateTasksTaskNameMetricUriDelete(@ApiParam(value = "A URI identifying an entry in a metrics registry.",required=true ) @PathVariable("uri") String uri,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2003> ietfLmapControllmapStateTasksTaskNameMetricUriGet(@ApiParam(value = "A URI identifying an entry in a metrics registry.",required=true ) @PathVariable("uri") String uri,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<InlineResponse2003>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2003> ietfLmapControllmapStateTasksTaskNameMetricUriPatch(@ApiParam(value = "A URI identifying an entry in a metrics registry.",required=true ) @PathVariable("uri") String uri,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody Metric3 metric) {
        // do some magic!
        return new ResponseEntity<InlineResponse2003>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2003> ietfLmapControllmapStateTasksTaskNameMetricUriPut(@ApiParam(value = "A URI identifying an entry in a metrics registry.",required=true ) @PathVariable("uri") String uri,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody Metric2 metric) {
        // do some magic!
        return new ResponseEntity<InlineResponse2003>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2009TasksTask> ietfLmapControllmapStateTasksTaskNamePatch(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The list of tasks available on the LMAP agent."  ) @RequestBody Task3 task) {
        // do some magic!
        return new ResponseEntity<InlineResponse2009TasksTask>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2009TasksTask> ietfLmapControllmapStateTasksTaskNamePut(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The list of tasks available on the LMAP agent."  ) @RequestBody Task2 task) {
        // do some magic!
        return new ResponseEntity<InlineResponse2009TasksTask>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateTasksTaskPatch(@ApiParam(value = "The list of tasks available on the LMAP agent."  ) @RequestBody List<InlineResponse2009TasksTask> task) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse2009TasksTask>> ietfLmapControllmapStateTasksTaskPost(@ApiParam(value = "The list of tasks available on the LMAP agent."  ) @RequestBody List<InlineResponse2009TasksTask> task) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse2009TasksTask>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapStateTasksTaskPut(@ApiParam(value = "The list of tasks available on the LMAP agent."  ) @RequestBody List<InlineResponse2009TasksTask> task) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
