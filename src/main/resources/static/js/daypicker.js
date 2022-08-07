function dateFormat(date) {
    let month = date.getMonth() + 1;
    let day = date.getDate();
    let hour = date.getHours();

    month = month >= 10 ? month : '0' + month;
    day = day >= 10 ? day : '0' + day;
    hour = hour >= 10 ? hour : '0' + hour;

    return date.getFullYear() + '-' + month + '-' + day;
}
var today = new Date();

$.fn.datepicker.dates['kr'] = {
days: ["일", "월", "화", "수", "목", "금", "토"],
daysShort: ["일", "월", "화", "수", "목", "금", "토"],
daysMin: ["일", "월", "화", "수", "목", "금", "토"],
months: ["1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월","9월","10월","11월","12월"],
monthsShort: ["1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월","9월","10월","11월","12월"],
today: "Today",
clear: "Clear",
format: "yyyy-mm-dd",
titleFormat: "yyyy mm",
weekStart: 0
};
$('#datepicker').datepicker({
    language : "kr",
    format:"yyyy-mm-dd",
    autoclose:true,
    startDate: dateFormat(today)
});