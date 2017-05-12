package io.swagger.api;

import io.swagger.model.Action;
import io.swagger.model.Action1;
import io.swagger.model.Agent;
import io.swagger.model.Agent1;
import io.swagger.model.Event;
import io.swagger.model.Event1;
import io.swagger.model.Events;
import io.swagger.model.Events1;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import io.swagger.model.InlineResponse2005;
import io.swagger.model.InlineResponse2006;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.InlineResponse200EventsEvent;
import io.swagger.model.InlineResponse200SchedulesAction;
import io.swagger.model.InlineResponse200SchedulesParameters;
import io.swagger.model.InlineResponse200SchedulesSchedule;
import io.swagger.model.InlineResponse200SuppressionsSuppression;
import io.swagger.model.InlineResponse200TasksMetric;
import io.swagger.model.InlineResponse200TasksOption;
import io.swagger.model.InlineResponse200TasksTask;
import java.util.List;
import io.swagger.model.Lmap;
import io.swagger.model.Lmap1;
import io.swagger.model.Metric;
import io.swagger.model.Metric1;
import io.swagger.model.Option;
import io.swagger.model.Option1;
import io.swagger.model.Option2;
import io.swagger.model.Option3;
import io.swagger.model.Parameters;
import io.swagger.model.Parameters1;
import io.swagger.model.Schedule;
import io.swagger.model.Schedule1;
import io.swagger.model.Schedules;
import io.swagger.model.Schedules1;
import io.swagger.model.Suppression;
import io.swagger.model.Suppression1;
import io.swagger.model.Suppressions;
import io.swagger.model.Suppressions1;
import io.swagger.model.Task;
import io.swagger.model.Task1;
import io.swagger.model.Tasks;
import io.swagger.model.Tasks1;

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
public class IetfLmapControllmapApiController implements IetfLmapControllmapApi {



    public ResponseEntity<Void> ietfLmapControllmapAgentDelete() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2001> ietfLmapControllmapAgentGet() {
        // do some magic!
        return new ResponseEntity<InlineResponse2001>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2001> ietfLmapControllmapAgentPatch(@ApiParam(value = "Configuration of parameters affecting the whole measurement agent."  ) @RequestBody Agent1 agent) {
        // do some magic!
        return new ResponseEntity<InlineResponse2001>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2001> ietfLmapControllmapAgentPut(@ApiParam(value = "Configuration of parameters affecting the whole measurement agent."  ) @RequestBody Agent agent) {
        // do some magic!
        return new ResponseEntity<InlineResponse2001>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapDelete() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapEventsDelete() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200EventsEvent>> ietfLmapControllmapEventsEventGet() {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200EventsEvent>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapEventsEventNameDelete(@ApiParam(value = "The unique name of an event source.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200EventsEvent> ietfLmapControllmapEventsEventNameGet(@ApiParam(value = "The unique name of an event source.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<InlineResponse200EventsEvent>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200EventsEvent> ietfLmapControllmapEventsEventNamePatch(@ApiParam(value = "The unique name of an event source.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The list of event sources configured on the LMAP agent."  ) @RequestBody Event1 event) {
        // do some magic!
        return new ResponseEntity<InlineResponse200EventsEvent>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200EventsEvent> ietfLmapControllmapEventsEventNamePut(@ApiParam(value = "The unique name of an event source.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The list of event sources configured on the LMAP agent."  ) @RequestBody Event event) {
        // do some magic!
        return new ResponseEntity<InlineResponse200EventsEvent>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapEventsEventPatch(@ApiParam(value = "The list of event sources configured on the LMAP agent."  ) @RequestBody List<InlineResponse200EventsEvent> event) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200EventsEvent>> ietfLmapControllmapEventsEventPost(@ApiParam(value = "The list of event sources configured on the LMAP agent."  ) @RequestBody List<InlineResponse200EventsEvent> event) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200EventsEvent>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapEventsEventPut(@ApiParam(value = "The list of event sources configured on the LMAP agent."  ) @RequestBody List<InlineResponse200EventsEvent> event) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2008> ietfLmapControllmapEventsGet() {
        // do some magic!
        return new ResponseEntity<InlineResponse2008>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2008> ietfLmapControllmapEventsPatch(@ApiParam(value = "Configuration of LMAP events.  Implementations may be forced to delay acting upon the occurance of events in the face of local constraints. An action triggered by an event therefore should not rely on the accuracy provided by the scheduler implementation."  ) @RequestBody Events1 events) {
        // do some magic!
        return new ResponseEntity<InlineResponse2008>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2008> ietfLmapControllmapEventsPut(@ApiParam(value = "Configuration of LMAP events.  Implementations may be forced to delay acting upon the occurance of events in the face of local constraints. An action triggered by an event therefore should not rely on the accuracy provided by the scheduler implementation."  ) @RequestBody Events events) {
        // do some magic!
        return new ResponseEntity<InlineResponse2008>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200> ietfLmapControllmapGet() {
        // do some magic!
        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200> ietfLmapControllmapPatch(@ApiParam(value = "Configuration of the LMAP agent."  ) @RequestBody Lmap1 lmap) {
        // do some magic!
        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200> ietfLmapControllmapPut(@ApiParam(value = "Configuration of the LMAP agent."  ) @RequestBody Lmap lmap) {
        // do some magic!
        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapSchedulesDelete() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2005> ietfLmapControllmapSchedulesGet() {
        // do some magic!
        return new ResponseEntity<InlineResponse2005>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2005> ietfLmapControllmapSchedulesPatch(@ApiParam(value = "Configuration of LMAP schedules. Schedules control which tasks are executed by the LMAP implementation."  ) @RequestBody Schedules1 schedules) {
        // do some magic!
        return new ResponseEntity<InlineResponse2005>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2005> ietfLmapControllmapSchedulesPut(@ApiParam(value = "Configuration of LMAP schedules. Schedules control which tasks are executed by the LMAP implementation."  ) @RequestBody Schedules schedules) {
        // do some magic!
        return new ResponseEntity<InlineResponse2005>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200SchedulesSchedule>> ietfLmapControllmapSchedulesScheduleGet() {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200SchedulesSchedule>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapSchedulesSchedulePatch(@ApiParam(value = "Configuration of a particular schedule."  ) @RequestBody List<InlineResponse200SchedulesSchedule> schedule) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200SchedulesSchedule>> ietfLmapControllmapSchedulesSchedulePost(@ApiParam(value = "Configuration of a particular schedule."  ) @RequestBody List<InlineResponse200SchedulesSchedule> schedule) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200SchedulesSchedule>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapSchedulesSchedulePut(@ApiParam(value = "Configuration of a particular schedule."  ) @RequestBody List<InlineResponse200SchedulesSchedule> schedule) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200SchedulesAction>> ietfLmapControllmapSchedulesScheduleScheduleNameActionGet(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200SchedulesAction>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameDelete(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200SchedulesAction> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameGet(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName) {
        // do some magic!
        return new ResponseEntity<InlineResponse200SchedulesAction>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200TasksOption>> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameOptionGet(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200TasksOption>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameOptionIdDelete(@ApiParam(value = "An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2004> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameOptionIdGet(@ApiParam(value = "An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName) {
        // do some magic!
        return new ResponseEntity<InlineResponse2004>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2004> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameOptionIdPatch(@ApiParam(value = "An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody Option3 option) {
        // do some magic!
        return new ResponseEntity<InlineResponse2004>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2004> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameOptionIdPut(@ApiParam(value = "An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody Option2 option) {
        // do some magic!
        return new ResponseEntity<InlineResponse2004>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameOptionPatch(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody List<InlineResponse200TasksOption> option) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200TasksOption>> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameOptionPost(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody List<InlineResponse200TasksOption> option) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200TasksOption>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameOptionPut(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody List<InlineResponse200TasksOption> option) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameParametersDelete(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200SchedulesParameters> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameParametersGet(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName) {
        // do some magic!
        return new ResponseEntity<InlineResponse200SchedulesParameters>(HttpStatus.OK);
    }

    public ResponseEntity<Parameters1> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameParametersPatch(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "This container is a place-holder for run-time parameters defined in task-specific or metric-specific data models augmenting the base lmap control data model."  ) @RequestBody Parameters1 parameters) {
        // do some magic!
        return new ResponseEntity<Parameters1>(HttpStatus.OK);
    }

    public ResponseEntity<Parameters> ietfLmapControllmapSchedulesScheduleScheduleNameActionNameParametersPut(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "This container is a place-holder for run-time parameters defined in task-specific or metric-specific data models augmenting the base lmap control data model."  ) @RequestBody Parameters parameters) {
        // do some magic!
        return new ResponseEntity<Parameters>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200SchedulesAction> ietfLmapControllmapSchedulesScheduleScheduleNameActionNamePatch(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "An action describes a task that is invoked by the schedule. Multiple actions are invoked sequentially."  ) @RequestBody Action1 action) {
        // do some magic!
        return new ResponseEntity<InlineResponse200SchedulesAction>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200SchedulesAction> ietfLmapControllmapSchedulesScheduleScheduleNameActionNamePut(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "An action describes a task that is invoked by the schedule. Multiple actions are invoked sequentially."  ) @RequestBody Action action) {
        // do some magic!
        return new ResponseEntity<InlineResponse200SchedulesAction>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapSchedulesScheduleScheduleNameActionPatch(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "An action describes a task that is invoked by the schedule. Multiple actions are invoked sequentially."  ) @RequestBody List<InlineResponse200SchedulesAction> action) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200SchedulesAction>> ietfLmapControllmapSchedulesScheduleScheduleNameActionPost(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "An action describes a task that is invoked by the schedule. Multiple actions are invoked sequentially."  ) @RequestBody List<InlineResponse200SchedulesAction> action) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200SchedulesAction>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapSchedulesScheduleScheduleNameActionPut(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "An action describes a task that is invoked by the schedule. Multiple actions are invoked sequentially."  ) @RequestBody List<InlineResponse200SchedulesAction> action) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapSchedulesScheduleScheduleNameDelete(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200SchedulesSchedule> ietfLmapControllmapSchedulesScheduleScheduleNameGet(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName) {
        // do some magic!
        return new ResponseEntity<InlineResponse200SchedulesSchedule>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200SchedulesSchedule> ietfLmapControllmapSchedulesScheduleScheduleNamePatch(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "Configuration of a particular schedule."  ) @RequestBody Schedule1 schedule) {
        // do some magic!
        return new ResponseEntity<InlineResponse200SchedulesSchedule>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200SchedulesSchedule> ietfLmapControllmapSchedulesScheduleScheduleNamePut(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "Configuration of a particular schedule."  ) @RequestBody Schedule schedule) {
        // do some magic!
        return new ResponseEntity<InlineResponse200SchedulesSchedule>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapSuppressionsDelete() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2006> ietfLmapControllmapSuppressionsGet() {
        // do some magic!
        return new ResponseEntity<InlineResponse2006>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2006> ietfLmapControllmapSuppressionsPatch(@ApiParam(value = "Suppression information to prevent schedules or certain actions from starting."  ) @RequestBody Suppressions1 suppressions) {
        // do some magic!
        return new ResponseEntity<InlineResponse2006>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2006> ietfLmapControllmapSuppressionsPut(@ApiParam(value = "Suppression information to prevent schedules or certain actions from starting."  ) @RequestBody Suppressions suppressions) {
        // do some magic!
        return new ResponseEntity<InlineResponse2006>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200SuppressionsSuppression>> ietfLmapControllmapSuppressionsSuppressionGet() {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200SuppressionsSuppression>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapSuppressionsSuppressionNameDelete(@ApiParam(value = "The locally-unique, administratively assigned name for this suppression.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2007> ietfLmapControllmapSuppressionsSuppressionNameGet(@ApiParam(value = "The locally-unique, administratively assigned name for this suppression.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<InlineResponse2007>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2007> ietfLmapControllmapSuppressionsSuppressionNamePatch(@ApiParam(value = "The locally-unique, administratively assigned name for this suppression.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "Configuration of a particular suppression."  ) @RequestBody Suppression1 suppression) {
        // do some magic!
        return new ResponseEntity<InlineResponse2007>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2007> ietfLmapControllmapSuppressionsSuppressionNamePut(@ApiParam(value = "The locally-unique, administratively assigned name for this suppression.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "Configuration of a particular suppression."  ) @RequestBody Suppression suppression) {
        // do some magic!
        return new ResponseEntity<InlineResponse2007>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapSuppressionsSuppressionPatch(@ApiParam(value = "Configuration of a particular suppression."  ) @RequestBody List<InlineResponse200SuppressionsSuppression> suppression) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200SuppressionsSuppression>> ietfLmapControllmapSuppressionsSuppressionPost(@ApiParam(value = "Configuration of a particular suppression."  ) @RequestBody List<InlineResponse200SuppressionsSuppression> suppression) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200SuppressionsSuppression>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapSuppressionsSuppressionPut(@ApiParam(value = "Configuration of a particular suppression."  ) @RequestBody List<InlineResponse200SuppressionsSuppression> suppression) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapTasksDelete() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2002> ietfLmapControllmapTasksGet() {
        // do some magic!
        return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2002> ietfLmapControllmapTasksPatch(@ApiParam(value = "Configuration of LMAP tasks."  ) @RequestBody Tasks1 tasks) {
        // do some magic!
        return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2002> ietfLmapControllmapTasksPut(@ApiParam(value = "Configuration of LMAP tasks."  ) @RequestBody Tasks tasks) {
        // do some magic!
        return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200TasksTask>> ietfLmapControllmapTasksTaskGet() {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200TasksTask>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapTasksTaskNameDelete(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200TasksTask> ietfLmapControllmapTasksTaskNameGet(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<InlineResponse200TasksTask>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200TasksMetric>> ietfLmapControllmapTasksTaskNameMetricGet(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200TasksMetric>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapTasksTaskNameMetricPatch(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody List<InlineResponse200TasksMetric> metric) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200TasksMetric>> ietfLmapControllmapTasksTaskNameMetricPost(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody List<InlineResponse200TasksMetric> metric) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200TasksMetric>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapTasksTaskNameMetricPut(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody List<InlineResponse200TasksMetric> metric) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapTasksTaskNameMetricUriDelete(@ApiParam(value = "A URI identifying an entry in a metrics registry.",required=true ) @PathVariable("uri") String uri,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2003> ietfLmapControllmapTasksTaskNameMetricUriGet(@ApiParam(value = "A URI identifying an entry in a metrics registry.",required=true ) @PathVariable("uri") String uri,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<InlineResponse2003>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2003> ietfLmapControllmapTasksTaskNameMetricUriPatch(@ApiParam(value = "A URI identifying an entry in a metrics registry.",required=true ) @PathVariable("uri") String uri,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody Metric1 metric) {
        // do some magic!
        return new ResponseEntity<InlineResponse2003>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2003> ietfLmapControllmapTasksTaskNameMetricUriPut(@ApiParam(value = "A URI identifying an entry in a metrics registry.",required=true ) @PathVariable("uri") String uri,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody Metric metric) {
        // do some magic!
        return new ResponseEntity<InlineResponse2003>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200TasksOption>> ietfLmapControllmapTasksTaskNameOptionGet(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200TasksOption>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapTasksTaskNameOptionIdDelete(@ApiParam(value = "An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2004> ietfLmapControllmapTasksTaskNameOptionIdGet(@ApiParam(value = "An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<InlineResponse2004>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2004> ietfLmapControllmapTasksTaskNameOptionIdPatch(@ApiParam(value = "An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody Option1 option) {
        // do some magic!
        return new ResponseEntity<InlineResponse2004>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2004> ietfLmapControllmapTasksTaskNameOptionIdPut(@ApiParam(value = "An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody Option option) {
        // do some magic!
        return new ResponseEntity<InlineResponse2004>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapTasksTaskNameOptionPatch(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody List<InlineResponse200TasksOption> option) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200TasksOption>> ietfLmapControllmapTasksTaskNameOptionPost(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody List<InlineResponse200TasksOption> option) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200TasksOption>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapTasksTaskNameOptionPut(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of options passed to the task. It is a list of key / value pairs and may be used to model options. Options may be used to identify the role of a task or to pass a channel name to a task."  ) @RequestBody List<InlineResponse200TasksOption> option) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200TasksTask> ietfLmapControllmapTasksTaskNamePatch(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The list of tasks configured on the LMAP agent."  ) @RequestBody Task1 task) {
        // do some magic!
        return new ResponseEntity<InlineResponse200TasksTask>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200TasksTask> ietfLmapControllmapTasksTaskNamePut(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The list of tasks configured on the LMAP agent."  ) @RequestBody Task task) {
        // do some magic!
        return new ResponseEntity<InlineResponse200TasksTask>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapTasksTaskPatch(@ApiParam(value = "The list of tasks configured on the LMAP agent."  ) @RequestBody List<InlineResponse200TasksTask> task) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200TasksTask>> ietfLmapControllmapTasksTaskPost(@ApiParam(value = "The list of tasks configured on the LMAP agent."  ) @RequestBody List<InlineResponse200TasksTask> task) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200TasksTask>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ietfLmapControllmapTasksTaskPut(@ApiParam(value = "The list of tasks configured on the LMAP agent."  ) @RequestBody List<InlineResponse200TasksTask> task) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
