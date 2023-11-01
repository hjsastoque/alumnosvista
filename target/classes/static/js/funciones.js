function eliminar(id) {
    console.log(id);
    swal({
        title: "Esta seguro de Eliminar?",
        text: "Una vez eliminado no se prodra restablecer!",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
        .then((OK) => {
            if (OK) {
                $.ajax({
                    url:"/del/"+id,
                    success: function(res) {
                        console.log(res);
                    },
                });
                swal("Poof! Registro eliminado!", {
                    icon: "success",
                }).then((ok)=>{
                    if(ok){
                        location.href="/listar";
                    }
                });
            }
        });
}


function myFunction() {
  // Declare variables
  var input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("myTable");
  tr = table.getElementsByTagName("tr");

  // Loop through all table rows, and hide those who don't match the search query
  for (i = 0; i <length; i++) {
    td = tr[i].getElementsByTagName("td")[0];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }
  }
}