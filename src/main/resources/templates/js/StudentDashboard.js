function logoutConfirm(){
    if(confirm('Confirm logout')){
        console.log('logout');
    }

}

document.addEventListener("DOMContentLoaded", function(event) { 
    document.getElementById('studentDashboardNavLogout').addEventListener('click', logoutConfirm);
});